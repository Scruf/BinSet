
import java.util.Arrays;
import java.util.Set;

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
 private static void resultTest(String message, boolean b){
	if (b){
	    System.out.println(message + " success");
	} else {
	    System.out.println(message + " failure");
	}
    }
    

    /**
     * Runs a suite of tests to validate the implemenation of BinSet
     * for Integer elements.
     *
     */

    private static void testInteger(){
Set<Integer> set = new BinSet<Integer>(Arrays.asList(1,3));
	
	resultTest("constructor 1",
		   Arrays.equals(set.toArray(), Arrays.asList(1,3).toArray()));
	
	set.add(2);
	resultTest("add 1",
		   Arrays.equals(set.toArray(), 
				 Arrays.asList(1,2,3).toArray()));
	
	resultTest("contains 1", set.contains(1));
	resultTest("contains 2", set.contains(2));
	resultTest("contains 3", set.contains(3));
	resultTest("contains 4", !set.contains(4));
	
	resultTest("size 1", set.size() == 3);
	
	set.clear();
	resultTest("clear/size", set.size() == 0);
	resultTest("clear/isEmpty", set.isEmpty());
	
	set.addAll(Arrays.asList(1,2,3));
	resultTest("addAll 1",set.size() == 3);
	
	resultTest("containsAll 1", set.containsAll(Arrays.asList(3,2)));
	resultTest("containsAll 2", !set.containsAll(Arrays.asList(4,3)));
	
	set.remove(2);
	resultTest("remove 1", 
		   Arrays.equals(set.toArray(), Arrays.asList(1,3).toArray()));
	
	Integer[] a = {1,3};
	int j = 0;
	for (Integer i : set){
	    resultTest("iterator " + i, i.equals(a[j]));
	    j++;
	}
	
	set.retainAll(Arrays.asList(3,4));
	resultTest("retainAll 1", 
		   Arrays.equals(set.toArray(), Arrays.asList(3).toArray()));
	
	resultTest("toArray(array) 1", 
		   Arrays.equals(set.toArray(new Integer[0]), 
				 Arrays.asList(3).toArray()));
        
    }
private static void testDouble(){
Set<Double> set = new BinSet<Double>(Arrays.asList(1.2,3.1));
	
	resultTest("constructor 1",
		   Arrays.equals(set.toArray(), Arrays.asList(1.2,3.1).toArray()));
	
	set.add(2.3);
	resultTest("add 1",
		   Arrays.equals(set.toArray(), 
				 Arrays.asList(1.2,2.3,3.1).toArray()));
	
	resultTest("contains 1", set.contains(1.2));
	resultTest("contains 2", set.contains(2.3));
	resultTest("contains 3", set.contains(3.1));
	resultTest("contains 4", !set.contains(4.5));
	
	resultTest("size 1", set.size() == 3);
	
	set.clear();
	resultTest("clear/size", set.size() == 0);
	resultTest("clear/isEmpty", set.isEmpty());
	
	set.addAll(Arrays.asList(1.2,2.3,3.1));
	resultTest("addAll 1",set.size() == 3);
	
	resultTest("containsAll 1", set.containsAll(Arrays.asList(3.1,2.3)));
	resultTest("containsAll 2", !set.containsAll(Arrays.asList(4.5,3.1)));
	
	set.remove(2.3);
	resultTest("remove 1", 
		   Arrays.equals(set.toArray(), Arrays.asList(1.2,3.1).toArray()));
	
	Double[] a = {1.2,3.1};
	int j = 0;
	for (Double i : set){
	    resultTest("iterator " + i, i.equals(a[j]));
	    j++;
	}
	
	set.retainAll(Arrays.asList(3.1,4.5));
	resultTest("retainAll 1", 
		   Arrays.equals(set.toArray(), Arrays.asList(3.1).toArray()));
	
	resultTest("toArray(array) 1", 
		   Arrays.equals(set.toArray(new Double[0]), 
				 Arrays.asList(3.1).toArray()));
    }

    /**
     * The main method for BinSet.  It runs any test scaffolding methods 
     * such as testInteger.
     *
     * @param args Command line arguments are not used.
     *
     */

    public static void main(String[] args){
	testInteger();
        System.out.println();
        testDouble();       
        Ranks r=null;
        Card card = new Card(r.THREE,"Clubs");
      
        //Testing constructors
         System.out.println("Testing first card constructor");
         String rank = "THREE";
         String suit = "Clubs";
        if(String.valueOf(card.r).equals(rank) && card.s.equals(suit))
             System.out.println("Constructor 1 created succesfully");
         else
             System.out.println("Cnstructor 1 was not created");
        Card card1 = new Card(r.THREE,"Spades");
        suit="Spades";
          if(String.valueOf(card1.r).equals(rank) && card1.s.equals(suit))
             System.out.println("Constructor 2 created succesfully");
         else
             System.out.println("Cnstructor 2 was not created");
          //testing equals method
          System.out.println("Testing equals method");
          Card card3 = new Card(r.DEUCE,"Spades");
          Card card4 = new Card(r.DEUCE,"Spades");
          if(card3.equals(card4))
              System.out.println("card 3 equals to card 4");
          else
              System.out.println("They are not equals");
          //checking if equals method will be able to recognize the difference
          //assigning the rank value to a THREE
          System.out.println("Chechking if equals method will be able "
                  + "to recognize the difference");
          card3 = new Card(r.THREE,"Spades");
          if(card3.equals(card4))
              System.out.println("Card 3 is equal to card 4");
          else
              System.out.println("They are not equals");
          //checking toString method
          //the expected result is THREE of Clubs
          System.out.println("Chechking toString method");
          System.out.println(card.toString());
          //checking compareTo method
          //first test check if one card is equals to another
          //card3 and card4 will be used
          System.out.println("Checking compareTo method ");
          System.out.println("compareTo nmethod will have to return 0 because "
                  + "both cards are equal");
          card3 = new Card(r.DEUCE,"Spades");
          if(card3.compareTo(card4)==0)
              System.out.println("They are equals");
          else
              System.out.println("They are not equals");
          //checking to see if one card is leseser than another card
          //compareTo method will return -1
          //compareTo method will use card and card1 to check
          //the expected result should be lesser
          if(card.compareTo(card1)<0)
              System.out.println("Card "+card.toString()+" is lesser than "+card1.toString());
          else
              System.out.println("failure");
                 //checking to see if one card is grater than another card
          //compareTo method will return -1
          //compareTo method will use card and card1 to check
          //the expected result should be greater
          if(card1.compareTo(card)>0)
               System.out.println("Card "+card.toString()+" is greater than "+card1.toString());
          else
              System.out.println("failure");
    }
}