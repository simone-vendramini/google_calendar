package consigliclasseparser;

import java.io.IOException;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class Parser {

    private List avvisi;

    public Parser() {
        avvisi = new ArrayList();
    }

    public List parseDocument(String filename)
            throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory factory;
        DocumentBuilder builder;
        Document document;
        Element root, element;
        NodeList nodelist;
        Avviso avviso;
        // creazione dell’albero DOM dal documento XML
        factory = DocumentBuilderFactory.newInstance();
        builder = factory.newDocumentBuilder();
        document = builder.parse(filename);
        root = document.getDocumentElement();
        // generazione della lista degli elementi "libro"
        nodelist = root.getElementsByTagName("li");
        if (nodelist != null && nodelist.getLength() > 0) {
            for (int i = 0; i < nodelist.getLength(); i++) {
                element = (Element) nodelist.item(i);
                avviso = getLibro(element);
                avvisi.add(avviso);
            }
        }
        return avvisi;
    }

    private Avviso getLibro(Element element) {
        Avviso avviso;
        String URL = element.getAttribute("href");
        String testoURL = getTextValue(element);
        avviso = new Avviso();
        return avviso;
    }
    
    // restituisce il valore testuale dell’elemento figlio specificato
    private String getTextValue(Element element) {
        String value = null;
        if (element != null ) {
            value = element.getFirstChild().getNodeValue();
        }
        return value;
    }
    
    
}