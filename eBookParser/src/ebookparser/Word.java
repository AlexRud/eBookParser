/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebookparser;

/**
 *
 * @author Alex
 */
public class Word {
    String name;
    int numberOfTimes=0;
    
    public Word(String createName){
        this.name = createName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void incrementNumberOfTimes() {
        this.numberOfTimes++;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfTimes() {
        return numberOfTimes;
    } 
}
