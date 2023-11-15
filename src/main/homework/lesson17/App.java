package main.homework.lesson17;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class App {
    public static void main(String[] args) throws SAXException, IOException {
        System.err.println(17);
        // https://www.baeldung.com/java-xerces-dom-parsing

        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = builder.parse(new File("Java/src/main/homework/lesson17/employees.xml"));
            doc.getDocumentElement().normalize();
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
