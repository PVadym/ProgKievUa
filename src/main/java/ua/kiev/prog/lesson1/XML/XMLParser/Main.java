package ua.kiev.prog.lesson1.XML.XMLParser;

public class Main {
    
    public static void main(String[] args) {
        SimpleXMLParser xml = new SimpleXMLParser("c:\\IdeaProjectProg\\JavaProCourse\\" +
                "src\\main\\java\\ua\\kiev\\prog\\lesson1\\XML\\XMLParser\\1.xml");
        String value = xml.get("catalog/book/author");
        System.out.println(value);
    }  
}