package ua.kiev.prog.lesson1.JSON.task3;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="rate")
public class Rate {

    @XmlAttribute
    private String id;
    @XmlElement
    private String Name;
    @XmlElement
    private double Rate;
    @XmlElement
    private String Date;
    @XmlElement
    private String Time;
    @XmlElement
    private String Ask;
    @XmlElement
    private String Bid;


    @Override
    public String toString() {
        return "Rate{" +
                "id='" + id + '\'' +
                ", Name='" + Name + '\'' +
                ", Rate=" + Rate +
                ", Date='" + Date + '\'' +
                ", Time='" + Time + '\'' +
                ", Ask='" + Ask + '\'' +
                ", Bid='" + Bid + '\'' +
                '}';
    }
}
