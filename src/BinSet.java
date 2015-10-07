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
        if(s.isEmpty())
            return -1;
        int start=0;
        int end=s.size()-1;
        int middle =s.size()/2;
      
        while(middle>=start && middle<=end)
        {
           if(s.get(middle).compareTo(e)==0)
               return middle;
           else if(start==end)
               return -1;
            if(s.get(middle).compareTo(e)<0){
                
                start=middle;
                start++;
                 middle = (end+middle+1)/2;
            }
            if(s.get(middle).compareTo(e)>0){
                end=middle;
                end--;
                 middle=(end+middle)/2;
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
  
    public boolean containsAll(Collection<?> c) {
       return s.containsAll(c);
      
    }

    // Comments
    @Override
    public boolean isEmpty() {
      return s.size()==0 ? true : false;
    }
          
    // Comments
   
    public Iterator<E> iterator() {
       return s.iterator();
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
   
    public boolean retainAll(Collection<?> c) {
      return s.retainAll(c);
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

   