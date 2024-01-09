package main.homework.lesson17.dom;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLParserDom {
    // origin:https://www.baeldung.com/java-xerces-dom-parsing
    public static List<String> parser(String patch, String tagName) {
        List<String> list = new ArrayList<>();
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document doc = null;
            try {
                doc = builder.parse(new File(patch));
                doc.getDocumentElement().normalize();
            } catch (SAXException | IOException e) {
                e.printStackTrace();
                list.add("Ошибка при создании парсера");
                return list;
            }

            for (int i = 0; i < doc.getElementsByTagName(tagName).getLength(); i++) {
                Node node = doc.getElementsByTagName(tagName).item(i);
                NodeList nodeList = node.getChildNodes();
                if (nodeList.getLength() == 1) {
                    list.add(node.getTextContent());
                } else {
                    int n = nodeList.getLength();
                    Node current;
                    for (int j = 0; j < n; j++) {
                        current = nodeList.item(j);
                        if (current.getNodeType() == Node.ELEMENT_NODE) {
                            list.add(
                                    current.getNodeName() + ": " + current.getTextContent());
                        }
                    }
                    System.out.println("\n");
                }

            }

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
            list.add("Ошибка в парсере");
            return list;
        }
        return list;
    }
}
