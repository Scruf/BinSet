/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ekozi
 */
public class Card {
    public enum Suit{
      Clubs,Diamonds,Heart,Spades
    };
    private Ranks r;
    private java.lang.String s;
    public Card(Ranks r, java.lang.String s){
        this.r=r;
        this.s=s;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
   public boolean equals(Object o){
       if(o==this)
           return true;
       if(!(o instanceof Card))
           return false;
       Card card =  (Card)o;
       return r.compareTo(card.r) == 0 && s.compareTo(card.s) == 0;
       
   }
    @Override
   public String toString(){
      return r.name()+" of "+this.s;
   }
  
   public int compareTo(Card c){
       Suit  suit;
       switch(c.s){
           case "Clubs":
                suit = Suit.Clubs ;
               break;
           case "Diamonds":
               suit = Suit.Diamonds;
               break;
           case "Heart":
               suit = Suit.Heart;
               break;
           case "Spades":
               suit = Suit.Spades;
               break;
           default:
               break;
       }
       if 
   }
}
