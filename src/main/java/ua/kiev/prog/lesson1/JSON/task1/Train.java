package ua.kiev.prog.lesson1.JSON.task1;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by Вадим on 21.08.2017.
 */
@XmlRootElement(name = "train")
public class Train {

    private int id;
    private String cityDeparture;
    private String cityArrival;
    private String dateDeparture;

    private String timeDeparture;

    public Train() {
    }

    public Train(int id, String cityDeparture, String cityArrival, String dateDeparture, String timeDeparture) {
        this.id = id;
        this.cityDeparture = cityDeparture;
        this.cityArrival = cityArrival;
        this.dateDeparture = dateDeparture;
        this.timeDeparture = timeDeparture;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public String getCityDeparture() {
        return cityDeparture;
    }

    @XmlElement(name = "from")
    public void setCityDeparture(String cityDeparture) {
        this.cityDeparture = cityDeparture;
    }

    public String getCityArrival() {
        return cityArrival;
    }

    @XmlElement(name = "to")
    public void setCityArrival(String cityArrival) {
        this.cityArrival = cityArrival;
    }

    public String getDateDeparture() {
        return dateDeparture;
    }

    @XmlElement(name = "date")
    public void setDateDeparture(String dateDeparture) {
        this.dateDeparture = dateDeparture;
    }

    public String getTimeDeparture() {
        return timeDeparture;
    }

    @XmlElement(name = "departure")
    public void setTimeDeparture(String timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        if (id != train.id) return false;
        if (cityDeparture != null ? !cityDeparture.equals(train.cityDeparture) : train.cityDeparture != null)
            return false;
        if (cityArrival != null ? !cityArrival.equals(train.cityArrival) : train.cityArrival != null) return false;
        if (dateDeparture != null ? !dateDeparture.equals(train.dateDeparture) : train.dateDeparture != null)
            return false;
        return timeDeparture != null ? timeDeparture.equals(train.timeDeparture) : train.timeDeparture == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cityDeparture != null ? cityDeparture.hashCode() : 0);
        result = 31 * result + (cityArrival != null ? cityArrival.hashCode() : 0);
        result = 31 * result + (dateDeparture != null ? dateDeparture.hashCode() : 0);
        result = 31 * result + (timeDeparture != null ? timeDeparture.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id=" + id +
                ", cityDeparture='" + cityDeparture + '\'' +
                ", cityArrival='" + cityArrival + '\'' +
                ", dateDeparture='" + dateDeparture + '\'' +
                ", timeDeparture='" + timeDeparture + '\'' +
                '}';
    }
}
