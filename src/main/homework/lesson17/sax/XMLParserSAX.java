package main.homework.lesson17.sax;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import main.homework.lesson17.Employee;

public class XMLParserSAX {
    public static void main(String[] args) {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            MyHandler handler = new MyHandler();
            saxParser.parse(new File("Java/src/main/homework/lesson17/employees.xml"), handler);
            // Get Employees list
            List<Employee> empList = handler.getEmpList();
            // print employee information
            for (Employee emp : empList)
                System.out.println(emp);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println("Ошибка доступа к файлу");
        }
    }
}
