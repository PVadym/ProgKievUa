package ua.kiev.prog.lesson1.JSON.task1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Вадим on 21.08.2017.
 */
@XmlRootElement(name = "trains")
public class Trains {

    private String xmlFile = "c:\\IdeaProjectProg\\JavaProCourse\\" +
            "src\\main\\java\\ua\\kiev\\prog\\lesson1\\JSON\\task1\\xml.xml";

    @XmlElement(name = "train")
    private List<Train> trains;

    public Trains() {
        this.trains = new ArrayList<>();
    }

    public void addToTrains(Train train) {
        trains.add(train);
        XMLUtil.saveToFile(xmlFile, this);

    }

    public void removeFromTrains(Train train) {
        this.trains.remove(train);
        XMLUtil.saveToFile(xmlFile, this);
    }

    public List<Train> getAllTrains() {
        if (trains.isEmpty()) {
            trains.addAll(XMLUtil.loadFromFile(xmlFile).trains);
        }
        return trains;
    }

    public List<Train> getTrainsByTime(String from, String to) {
        LocalTime fromTime = LocalTime.parse(from, DateTimeFormatter.ISO_TIME);
        LocalTime toTime = LocalTime.parse(to, DateTimeFormatter.ISO_TIME);
        return trains
                .stream()
                .filter(train ->
                        LocalTime.parse(train.getTimeDeparture()).isAfter(fromTime)
                                && LocalTime.parse(train.getTimeDeparture()).isBefore(toTime))
                .collect(Collectors.toList());
    }
}
