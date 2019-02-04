/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consigliclasseparser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author LENOVO
 */
public class ConsigliClasseParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List links = null;
        Parser dom = new Parser();
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Digitare percorso file XML");
            String percorso=inFromUser.readLine();
            links = dom.parseDocument(percorso);
        } catch (ParserConfigurationException | SAXException | IOException exception) {
            System.out.println("Errore!");
        }
        // iterazione della lista e visualizzazione degli oggetti
        System.out.println("Numero di Link: " + links.size());
        Iterator iterator = links.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

    
    }
    
}
