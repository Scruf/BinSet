// Comments

import java.util.*;

// Comments

public class BinSet<E extends Comparable<? super E>> extends AbstractSet<E> {

    private ArrayList<E> s = new ArrayList<E>();

    // Comments
    public BinSet(){  
      
    }
  
    // Comments
    public BinSet(java.util.Collection<? extends E> c){
      addAll(c);
    }
    
    /**
     * private helper function that implements the binary search
     * Searches for an element using the binary-search algorithm.
     *
     * @param       e     The element the the method searches for in the 
     *                    private ArrayList.
     *
     * @return             An int, either the index of the position of e
     *                     or -1 indicating failure to find e.
     *
     */
    public int binarySearch(E e){
        int start = 1 ;
        int middle = (int)Math.floor(s.size()/2);
        int end = s.size();
        while(start<end || middle!=0 && s.get(middle).compareTo(e)!=0){
           if(s.get(middle).compareTo(e)==0)
               return middle;
           else if(s.get(middle).compareTo(e)>0){
               start=middle;
               middle = (start+end)/2;
               start++;
           }
           else{
               end = middle;
               middle = (start+end+1)/2;
               end--;
               
           }
               
        }
        return -1;
    }

    // Comments

    /**
     *
     * @param e
     * @return
     */
        @Override
    public boolean add(E e) {
        if(s.isEmpty())
        {
            s.add(e);
            Collections.sort(s);
        
        }
        else{
            if(s.contains(e))
                return false;
            else{
               
                s.add(e);
                 Collections.sort(s);
            }
        }
        
        return true;
    }

    // Comments
    @Override
    public boolean addAll(Collection<? extends E> c) {
      boolean added = false;
       for(E q : c)
       {
          
           
          if(s.isEmpty()){
           
              s.add(q);
            }
          else{
              if(s.contains(q))
              {
                  s.add(q);

                  added = true;
              }
              else{
                  s.add(q);
                  added= false;
              }
          }
       }
     return added;
    }

    // Comments
    @Override
    public void clear() {
        s.clear();
    }
     
    // Comments
    @SuppressWarnings("unchecked")
    @Override
    public boolean contains(Object o) {
        if(binarySearch((E)o)==-1)
            return false;
        else
            return true;
      }

    // Comments
    @Override
    public boolean containsAll(Collection<?> c) {
         return true;
    }

    // Comments
    @Override
    public boolean isEmpty() {
      return s.size()==0 ? true : false;
    }
          
    // Comments
    @Override
    public Iterator<E> iterator() {
        return null;
        // YOUR CODE GOES HERE
    }
    
    // Comments
    @Override
    public boolean remove(Object o) {
        if (s.contains(o))
        {
            s.remove(o);
            return true;
        }
        else return false;
    }
     
    // Comments
    @Override
    public boolean retainAll(Collection<?> c) {
      return true;
    }
    
  // Comments
    @Override
    public int size() {
       return s.size();
    }
     

    // Comments

    /**
     * create a pointer with a name array of the type object
     * allocate size ammount of memory to an array
     * @param counter  will be an index of the array
     * iterate over the collection s and add all one by one element to array
     * increment counter by one and move a pointer 
     * return a pointer to a variable array 
     * @return
     */
        @Override
    public Object[] toArray() {
      Object array [];
        array = new Object[size()];
      int counter = 0;
      for(E q : s){
          array[counter]=q;
          counter++;
      }
      return array;
    }
     
    // Comments
    @SuppressWarnings("unchecked")
    @Override
    public <T> T[] toArray(T[] a) {
      return s.toArray(a);
    }
    

    // Comments
    @Override
    public String toString(){
       return s.toString();

    }


    /**
     * Displays a message followed by success or failure indicating
     * whether or not a particular test was successful.
     *
     * @param message The String form of the message.
     *
     * @param       b    A boolean indicating whether the test was successful 
     *			 or not.    
     *
     */

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
	Set<Integer> set = new BinSet<>(Arrays.asList(1,3));
	
	resultTest("constructor 1",
		   Arrays.equals(set.toArray(), Arrays.asList(1,3).toArray()));
	
	set.add(2);
      
        System.out.println("set after adding 2 is "+set);
        resultTest("add 1",
		   Arrays.equals(set.toArray(), 
				 Arrays.asList(1,2,3).toArray()));
	
	resultTest("contains 1", set.contains(1));
	resultTest("contains 2", set.contains(2));
	resultTest("contains 3", set.contains(3));
	resultTest("contains 4", !set.contains(4));
      
        resultTest("size 1", set.size() == 3);
	set.clear();
        System.out.println("The set after removal is "+set);
	resultTest("clear/size", set.size() == 0);
	resultTest("clear/isEmpty", set.isEmpty());
         
        set.addAll(Arrays.asList(1,2,3));
        
	resultTest("addAll 1",set.size() == 3);
        System.out.println("Set is "+set);
       
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
   }

}
