/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebookparser;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author Alex
 */
public class Book {

    TreeMap<String, Integer> words;

    public Book() {
        words = new TreeMap();
    }
    
    public void wordExists(String word) {   
        if (words.containsKey(word)) {
            int i = words.get(word);
            i++;
            words.put(word, i);
        } else {
            words.put(word, 1);
        }
    }

//    public String printNumberOfTimes(String word) {
//        Word w = getWord(word);
//        return "Name: " + w.getName() + " " + "Number of Times Mentioned" + w.getNumberOfTimes();
//    }

    //public Word getWord(String word) {
        //return words.get(word);
    //}
    
    public void FixEntries(){        
        Iterator it = words.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            if(pair.getKey().equals("")){
                it.remove();
            }
            //else if(pair.getKey().){
                
            //}
        }
    }

    public SortedMap getHashMap() {
        FixEntries();
        return words;
    }

}
