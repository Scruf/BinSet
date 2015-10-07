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
         Card card1 = new Card(r.THREE,"Clubs");
        System.out.println(card1.toString());
       
        if(card.equals(card1))
            System.out.print("They are equals");
        else
            System.out.print("They are not equals");
    }
}
