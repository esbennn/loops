//remember to import stuff
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
/**
 * A small class containing examples of different types of loops.
 * Note the libraries that have been imported.
 * @author Esben
 * 
 */
public class Examples
{

    /**
     * Constructor - no parameters
     */
    public Examples()
    {
        // forloopExample();
        //  forEachExample();
        //  iteratorExample();
        //  whileExample();
        

    }

    /**
     * Ordinary for-loop - looping through ordinary array
     */
    public void forloopExample(){
        //initialize the string[]
        String[] stringArray = new String[3];
        //loop through it, adding text and printing.
        for (int i=0; i<stringArray.length; i++){
            stringArray[i] = "testing, one-two one-two " + i;
            System.out.println(stringArray[i]);
        }
    }
        
    /**
     * Example with ordinary while-loop
     */
    public void whileExample(){
        //init intArray
        int[] intArray = {1,2,3,4,5,6,7,8,9,0};
        //loop counter
        int i = 0;
        while (i<intArray.length){
            System.out.println(intArray[i]);
            i++; // remember this or loop is infinite
        }
    }

    /**
     * For-earch loop, looping through an ArrayList. Note the angled bracket syntax (<>).
     */
    public void forEachExample(){
        //initialize he ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();
        //add some stuff
        arrayList.add("Skynet");
        arrayList.add("has");
        arrayList.add("become");
        arrayList.add("aware");
        // for each loop - note the syntax in the parantheses
        for (String aString : arrayList){
            // type  name  in name of list
            System.out.println(aString);
        }

    }

    /**
     * Example with iterator combined with for-loop and while-loop
     */
    public void iteratorExample(){
        //init ArrayList
        ArrayList<String> arrayList = new ArrayList<String>();
        //Adding strings
        arrayList.add("Skynet");
        arrayList.add("has");
        arrayList.add("become");
        arrayList.add("aware");
        
        //for-each loop
        System.out.println("Using for-each loop to print list. \nArrayList with elements added:");
        for (String aString : arrayList){
            System.out.println(aString);
        }

        //for loop with iterator
        System.out.println("Removing string: ");
        for (Iterator<String> anIterator = arrayList.iterator(); anIterator.hasNext();){
            String string = anIterator.next();
            if(string == "become"){
                System.out.println(string);
                anIterator.remove();
            }
        }
        
        //while loop with iterator
        System.out.println("Looping through list with while-loop/iterator. \nArrayList after removing a string in previous loop");
        Iterator<String> anIterator = arrayList.iterator();
        while (anIterator.hasNext()){
            String s = anIterator.next();
            System.out.println(s);
         //   anIterator.next();
        }
    }
}
