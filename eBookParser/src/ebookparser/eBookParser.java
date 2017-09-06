/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebookparser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
//public class EBookParser {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        //"C:\Users\Alex\Documents\Calibre Library\J.K. Rowling\Harry Potter and the Cursed Child (2)\Harry Potter and the Cursed Chi - J.K. Rowling.txt"
//        
//        File f1 = new File("C:\\Users\\Alex\\Documents\\Calibre Library\\J.K. Rowling\\Harry Potter and the Cursed Child (2)\\Harry Potter and the Cursed Chi - J.K. Rowling.txt");
//        int lines=0;
//        ArrayList array;
//        
//        if (f1.exists()) {
//            try {
//                String currentLine;
//                InputStreamReader isr = new InputStreamReader(new FileInputStream(f1));
//                BufferedReader br = new BufferedReader(isr);
//                while((currentLine=br.readLine()) != null){
//                    System.out.println(currentLine);
//                    array = new ArrayList();
//                    array.add(currentLine);
//                    lines++;
//            }
//                System.out.println(lines);
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(EBookParser.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(EBookParser.class.getName()).log(Level.SEVERE, null, ex);
//            } 
//        }
//    }
//    
//}
