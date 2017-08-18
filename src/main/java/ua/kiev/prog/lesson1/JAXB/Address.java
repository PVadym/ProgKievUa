package ua.kiev.prog.lesson1.JAXB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * Created by Вадим on 18.08.2017.
 */
@XmlRootElement
public class Address {

    @XmlAttribute(name = "city")
    private String attr;

    @XmlValue
    private String city;

    public Address() {
    }

    public Address(String attr, String city) {
        this.attr = attr;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "attribute='" + attr + '\'' +
                '}';
    }
}
