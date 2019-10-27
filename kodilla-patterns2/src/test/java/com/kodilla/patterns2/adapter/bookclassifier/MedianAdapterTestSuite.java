package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        Book book1 = new Book("John Smith", "Biography", 2001);
        Book book2 = new Book("Pablo Escobar", "Biography", 2002);
        Book book3 = new Book("Walter White", "Biography", 2003);
        Book book4 = new Book("Jessie Pinkman", "Biography", 2004);
        Book book5 = new Book("Mel Brooks", "Biography", 2005);

        BookSignature bookSignature1 = new BookSignature("1");
        BookSignature bookSignature2 = new BookSignature("2");
        BookSignature bookSignature3 = new BookSignature("3");
        BookSignature bookSignature4 = new BookSignature("4");
        BookSignature bookSignature5 = new BookSignature("5");

        Map<BookSignature, Book> bookMap = new HashMap<>();
        bookMap.put(bookSignature1, book1);
        bookMap.put(bookSignature2, book2);
        bookMap.put(bookSignature3, book3);
        bookMap.put(bookSignature4, book4);
        bookMap.put(bookSignature5, book5);

        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.medianPublicationYear(bookMap);
        //Then
        System.out.println(median);
        assertEquals(2003, median);
    }
}
