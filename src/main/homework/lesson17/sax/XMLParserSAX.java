package main.homework.lesson17.sax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLParserSax {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();

        BaeldungHandler baeldungHandler = new BaeldungHandler();
        saxParser.parse("Java/src/main/homework/lesson17/baeldung.xml", baeldungHandler);
        List<String> bd = baeldungHandler.getWebsite();
        System.out.println("bd " + bd.toString());
    }

    public static class BaeldungHandler extends DefaultHandler {

        private StringBuilder elementValue;
        public List<String> list = new ArrayList<>();

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            if (elementValue == null) {
                elementValue = new StringBuilder();
            } else {
                elementValue.append(ch, start, length);
            }
        }

        @Override
        public void startDocument() throws SAXException {

        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes)
                throws SAXException {
            if (qName.equalsIgnoreCase("title")) {
                elementValue = new StringBuilder();
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if (qName.equalsIgnoreCase("title")) {
                list.add(elementValue.toString());
            }
        }

        public List<String> getWebsite() {
            // return (Baeldung) website;
            return list;
        }
    }

}
