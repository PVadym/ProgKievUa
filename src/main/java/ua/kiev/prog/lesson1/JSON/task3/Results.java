package ua.kiev.prog.lesson1.JSON.task3;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

@XmlRootElement(name="results")
public class Results {

    @XmlElement
    private Rate[] rate;

    @Override
    public String toString() {
        return "Results{" +
                "rate=" + Arrays.toString(rate) +
                '}';
    }
}
