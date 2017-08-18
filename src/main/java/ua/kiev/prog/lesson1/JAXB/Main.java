package ua.kiev.prog.lesson1.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.add(new Book("Author1", "Title1", 14.55, new Date(), new Address("Frstdrg", "5")));
        catalog.add(new Book("Author2", "Title2", 66, new Date(), new Address("JJGFYf", "6")));

        try {
            File file = new File("c:\\IdeaProjectProg\\JavaProCourse\\" +
                    "src\\main\\java\\ua\\kiev\\prog\\lesson1\\JAXB\\output.xml");
            // корневой класс Catalog
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            Marshaller marshaller = jaxbContext.createMarshaller();

            // читабельное форматирование с табуляциями и отступами
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // пишем в файл
            marshaller.marshal(catalog, file);
            //выводим на консоль
            marshaller.marshal(catalog, System.out);

            // читаем из файла
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            catalog = (Catalog) unmarshaller.unmarshal(file);
            System.out.println(catalog);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }  
}