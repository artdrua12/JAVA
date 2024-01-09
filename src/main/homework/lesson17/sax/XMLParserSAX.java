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

public class XMLParserSAX {

    public String tagName;
    public String patch;

    public List<String> parser(String patch, String tagName) throws ParserConfigurationException,
            SAXException, IOException {
        this.tagName = tagName;
        this.patch = patch;
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();

        Handler handler = new Handler();
        saxParser.parse(patch, handler);
        return handler.list;
    }

    public class Handler extends DefaultHandler {

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
        public void startElement(String uri, String localName, String qName, Attributes attributes)
                throws SAXException {
            if (qName.equalsIgnoreCase(tagName)) {
                elementValue = new StringBuilder();
            }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            if (qName.equalsIgnoreCase(tagName)) {
                list.add(elementValue.toString());
            }
        }
    }

}
