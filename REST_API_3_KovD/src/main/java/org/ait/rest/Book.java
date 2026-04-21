package org.ait.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
    public String title;
    public String author;
    public String publisher;
    public int year;

    public Book() {}
}