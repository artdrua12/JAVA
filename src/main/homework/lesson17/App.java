package main.homework.lesson17;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import main.homework.lesson17.sax.XMLParserSax.BaeldungHandler;

public class App {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        // получение номера работы
        // int numWork = Entrance.enter.get();
        // // проверка нужен ли выход
        // if (numWork == 3)
        // return;

        // List<String> list =
        // XMLParserDom.parser("Java/src/main/homework/lesson17/xml.xml", "list");
        // for (String l : list) {
        // System.out.println(l);
        // }

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();

        BaeldungHandler baeldungHandler = new BaeldungHandler();
        saxParser.parse("Java/src/main/homework/lesson17/baeldung.xml", new BaeldungHandler());
        System.out.println("bd " + baeldungHandler.getWebsite().toString());

    }

}
