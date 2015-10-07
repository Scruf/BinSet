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
    int number =0;   
    //object to be compared
       Suit  suit2=null;
       int comparator2 =0;
       switch(c.s){
           case "Clubs":
                suit2 = Suit.Clubs ;
                comparator2=1;
               break;
           case "Diamonds":
               suit2 = Suit.Diamonds;
               comparator2=2;
               break;
           case "Heart":
               suit2 = Suit.Heart;
                comparator2=3;
               break;
           case "Spades":
               suit2 = Suit.Spades;
               comparator2=4;
               break;
           default:
               break;
       }
      //super object
       int comparator1 = 0;
       Suit suit1 = null;
      switch(s){
          case "Clubs":
                suit1 = Suit.Clubs ;
                comparator1=1;
               break;
           case "Diamonds":
               suit1 = Suit.Diamonds;
               comparator1=2;
               break;
           case "Heart":
               suit1 = Suit.Heart;
                comparator1=3;
               break;
           case "Spades":
               suit1 = Suit.Spades;
               comparator1=4;
               break;
           default:
               break;
      }
     
        Object o = c;
        c=(Card)o;
        System.out.println("The values are "+comparator1+" "+comparator2);
        if(comparator1==comparator2 && r.getValue()==c.r.getValue())
            number= 0;
        //same suit but different number
        if(comparator1==comparator2 && r.getValue()>c.r.getValue())
            number= 1;
         if(comparator1==comparator2 && r.getValue()<c.r.getValue())
            number =-1;
          if(comparator1>comparator2)
            number= 1;
          if(comparator1<comparator2)
              return -1;
              
           return number;
     
   }
}
