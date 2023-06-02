package lesson22;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SAXParserExample {

    public static void main(String[] args) {
        try {

            SAXParserFactory factory = SAXParserFactory.newDefaultInstance();
            SAXParser parser = factory.newSAXParser();
            parser.parse(
                    new File("resources/test.xml"),
                    new MyHandler()
            );

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    private static class MyHandler extends DefaultHandler {

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            System.out.println(qName);
            System.out.println(attributes.getQName(0) + ": " + attributes.getValue(0));
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            System.out.println(String.valueOf(ch, start, length));
        }
    }
}
