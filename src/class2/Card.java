/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class2;

/**
 *
 * @author Brandon
 */
public class Card {
    
    private String suit;
    private int value;
    
    Card(){
    }
    
    Card(String suit, int value){
        this.suit = suit;
        this.value = value;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        if(suit.equals("Clubs") || suit.equals("Spades") || suit.equals ("Hearts") || suit.equals("Diamonds"))
            {this.suit = suit;}
        else{
                System.out.println("Incorrect suit. Please enter a valid suit.");
        }
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        if(value >= 1 && value <= 13)
            {this.value = value;}
        else{
                System.out.println("Incorrect value. Please enter a valid value.");
        }
    }
    
 
    
    
}
