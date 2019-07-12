package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Sugar");
        Product product1 = new Product("Tomato");
        Product product2 = new Product("Book");
        Product product3 = new Product("Banana");

        Item item = new Item(product, new BigDecimal(15), 7, new BigDecimal(15*7));
        Item item1 = new Item(product1, new BigDecimal(10), 2, new BigDecimal(10*2));
        Item item2 = new Item(product, new BigDecimal(80), 3, new BigDecimal(80*3));
        Item item3 = new Item(product3, new BigDecimal(30), 4, new BigDecimal(30*4));
        Item item4 = new Item(product2, new BigDecimal(30), 4, new BigDecimal(30*4));

        Invoice invoice = new Invoice("Invoice 100/2019");
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);

        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}

