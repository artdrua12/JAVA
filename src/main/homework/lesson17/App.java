package main.homework.lesson17;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

import main.homework.lesson17.dom.XMLParserDom;
import main.homework.lesson17.sax.XMLParserSAX;

public class App {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        // Задача1 + Задача*

        // получение номера работы
        int numWork = Entrance.enter.get();
        // проверка нужен ли выход
        List<String> list = new ArrayList<>();
        if (numWork == 3)
            return;
        else if (numWork == 1) {
            list = new XMLParserSAX().parser("Java/src/main/homework/lesson17/xml.xml", "line");
        } else if (numWork == 1) {
            list = XMLParserDom.parser("Java/src/main/homework/lesson17/xml.xml", "line");
        }

        for (String lst : list) {
            System.out.println(lst);
        }

    }

}
