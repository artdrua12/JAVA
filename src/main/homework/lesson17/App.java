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
        String[] array = new String[] { "lastName", "firstName", "title" };
        String forWriteFile = "line";
        List<String> listForNameFile = new ArrayList<>();
        List<String> listForWriteFile = new ArrayList<>();
        // получение номера работы
        int numWork = Entrance.enter.get();

        // получение номера для выбора парсера
        if (numWork == 1) {
            for (String str : array) {
                listForNameFile.addAll(new XMLParserSAX().parser("Java/src/main/homework/lesson17/xml.xml", str));
            }
            listForWriteFile.addAll(new XMLParserSAX().parser("Java/src/main/homework/lesson17/xml.xml", forWriteFile));

        } else if (numWork == 2) {
            for (String str : array) {
                listForNameFile.addAll(XMLParserDom.parser("Java/src/main/homework/lesson17/xml.xml", str));
            }
            listForWriteFile.addAll(XMLParserDom.parser("Java/src/main/homework/lesson17/xml.xml", forWriteFile));
        } else {
            return;
        }
        // Запись в файл
        WorkWichFiles.writeFile(listForNameFile, listForWriteFile);

    }

}
