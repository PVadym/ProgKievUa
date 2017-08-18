package ua.kiev.prog.lesson1.JAXB;

import java.util.Date;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Bios on 28.04.14.
 */

@XmlRootElement(name="book")
public class Book {

    private String author;
    private String title;
    private double price;
    private Date publishDate;

    private Address address;

    public Book() {}

    public Book(String author, String title, double price, Date publishDate, Address address) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publishDate = publishDate;
        this.address = address;
    }

    @Override
    public String toString() {
        return "[" + author + ", " + title + ", " + price + ", " + publishDate + "]";
    }

    public Date getPublishDate() {
        return publishDate;
    }

    @XmlElement(name="publish_date")
    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public double getPrice() {
        return price;
    }

    @XmlElement
    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    @XmlElement
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    @XmlElement
    public void setAuthor(String author) {
        this.author = author;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
