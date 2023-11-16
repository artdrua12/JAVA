package main.homework.lesson17;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserMain {
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
            website = new Baeldung();
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes)
                throws SAXException {
            if (qName.equalsIgnoreCase("title")) {
                System.out.println("ddddd " + qName);
                elementValue = new StringBuilder();
            }
            // switch (qName) {
            // case ARTICLES:
            // website.setArticleList(new ArrayList<>());
            // break;
            // case ARTICLE:
            // website.getArticleList().add(new BaeldungArticle());
            // break;
            // case TITLE:
            // elementValue = new StringBuilder();
            // break;
            // case CONTENT:
            // elementValue = new StringBuilder();
            // break;
            // }
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            // latestArticle().content = (elementValue.toString());
            if (qName.equalsIgnoreCase("title")) {
                list.add(elementValue.toString());
            }
            // switch (qName) {
            // case TITLE:
            // latestArticle().title = (elementValue.toString());
            // break;
            // case CONTENT:
            // latestArticle().content = (elementValue.toString());
            // break;
            // }
        }

        // private BaeldungArticle latestArticle() {
        // List<BaeldungArticle> articleList = website.getArticleList();
        // int latestArticleIndex = articleList.size() - 1;
        // return articleList.get(latestArticleIndex);
        // }

        public List<String> getWebsite() {
            // return (Baeldung) website;
            return list;
        }
    }

    public static class Baeldung {
        private List<BaeldungArticle> articleList;

        public void setArticleList(List<BaeldungArticle> articleList) {
            this.articleList = articleList;
        }

        public List<BaeldungArticle> getArticleList() {
            return this.articleList;
        }
    }

    public static class BaeldungArticle {
        // public String title;
        public String content;
    }
}
