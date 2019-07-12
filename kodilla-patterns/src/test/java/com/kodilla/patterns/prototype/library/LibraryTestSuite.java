package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library of Congress, Washington");
        library.getBooks().add(new Book("The Associate", "John Grisham", LocalDate.of(2009, 1, 27)));
        library.getBooks().add(new Book("The Last Juror", "John Grisham", LocalDate.of(2004, 2, 3)));
        library.getBooks().add(new Book("The Appeal", "John Grisham", LocalDate.of(2008, 1, 29)));
        library.getBooks().add(new Book("The Innocent Man", "John Grisham", LocalDate.of(2006, 10, 10)));
        library.getBooks().add(new Book("The Summons", "John Grisham", LocalDate.of(2002, 1, 7)));
        library.getBooks().add(new Book("The Street Lawyer", "John Grisham", LocalDate.of(1998, 9, 27)));
        library.getBooks().add(new Book("Rainmaker", "John Grisham", LocalDate.of(1995, 10, 20)));
        library.getBooks().add(new Book("The Firm", "John Grisham", LocalDate.of(1993, 2, 1)));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Trinity College Library, Dublin");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("British Library, London");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().clear();
        //Then
        System.out.println(library.getName());
        System.out.println(library.getBooks());
        System.out.println(clonedLibrary.getName());
        System.out.println(clonedLibrary.getBooks());
        System.out.println(deepClonedLibrary.getName());
        System.out.println(deepClonedLibrary.getBooks());
        Assert.assertEquals("Library of Congress, Washington", library.getName());
        Assert.assertEquals(0, library.getBooks().size());
        Assert.assertEquals(0, clonedLibrary.getBooks().size());
        Assert.assertEquals(8, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(library.getBooks(), clonedLibrary.getBooks());
        Assert.assertNotEquals(clonedLibrary.getBooks(), deepClonedLibrary.getBooks());
    }
}
