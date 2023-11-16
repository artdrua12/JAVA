package main.homework.lesson17.sax;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public static class XMLParserSAX extends DefaultHandler {

    private StringBuilder elementValue;
    public List<String> list = new ArrayList<>();

    public static void parser() {

    @Override
    public void characters(char[] ch, int start, int length) {
        if (elementValue == null) {
            elementValue = new StringBuilder();
        } else {
            elementValue.append(ch, start, length);
        }
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
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
