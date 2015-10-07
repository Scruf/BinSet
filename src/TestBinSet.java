/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ekozi
 */
public class TestBinSet {
    public static void main(String []args){
        Ranks r=null;
        Card card = new Card(r.THREE,"Clubs");
        System.out.println(card.toString());
         Card card1 = new Card(r.THREE,"Spades");
        System.out.println(card1.toString());
       
       if(card.compareTo(card1)==0)
           System.out.println("They are  equal");
       else if(card.compareTo(card1)>1)
           System.out.print("card1 is grater than card2");
       else{
                System.out.print("card2 is grater than card1s");
       } 
    }
}
