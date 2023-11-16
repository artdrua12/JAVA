package main.homework.lesson17;

import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import main.homework.lesson17.dom.XMLParserDom;

public class App {
    public static void main(String[] args) {

        // получение номера работы
        int numWork = Entrance.enter.get();
        // проверка нужен ли выход
        if (numWork == 3)
            return;

        List<String> list = XMLParserDom.parser("Java/src/main/homework/lesson17/xml.xml", "list");
        for (String l : list) {
            System.out.println(l);
        }

    }

}
