import java.io.*;
import java.util.*;

public class ArrayMain {

    /**
     * Our main method.
     *  - Prompt user for a # of elements.
     *  - Create array of that size, using random values in the range
     *    -1000 to 1000, inclusive.
     *  - Compute and print various things about the array's contents.
     * @param args
     * 
     * Justification: There is no documention of what exactly the helper methods do 
     * in this class. Although we can deduce it can be implied what they do, an Intro 
     * student might find difficulty in how and why these are being used.
     * 
     * Context: A student new to programming comes across this lab. They depend a lot 
     * on the documentation provided in the starter code, yet there is little/none 
     * given with the helper methods. They might try to make an array with random 
     * values initially not knowing or understanding that there is a method that does 
     * this for them, thus taking away from the lessons in the lab.
     * 
     * Importance: This will be helpful for both the students and the professor. The 
     * students will be given more documentation on the methods without giving away
     * any answers for the lab itself, which will make a lot of the questions that 
     * the professor may recieve about the lab itself, not on the confusing parts
     * of the starter code.
     *
     * Content Below Added by Santiago P. Franco:
     * 
     * getNumElements Method:
     *      -Params = NONE
     *      -RetVal = int
     *      -Prints out prompt for user to type in # of elements wanted
     *      -The next value typed out by user will be put into numElements
     *      -Usage in main method: Utilized in createNumberArray method
     *---------------------------------------------------------------------------
     *
     * createNumberArray Method: 
     *      -Params = int
     *      -RetVal = int[]
     *      -Using this method will create an array of size numElements (see above)
     *      and every cell will contain a random value between -1000 & 1000
     *---------------------------------------------------------------------------
     */
    public static void main(String[] args) {
        int numElements = getNumElements();
        if (numElements <= 0) {
            System.out.println("We need a positive number.");
            return;
        }

        // declare and initialize our array
        int[] numberArray = createNumberArray(numElements);

        /////////////////////////////////////////////////////////////////
        //   At this point, the array has been created and initialized.
        /////////////////////////////////////////////////////////////////

        // ***** CHECKPOINT 1 *****
        // Print the numbers, followed by a line of dashes


        // ***** CHECKPOINT 2 *****
        // Compute/print the average of the numbers


        //System.out.println("The average of the numbers is "+???);

        
        // ***** CHECKPOINT 3 *****
        // Set a breakpoint somewhere above and show the contents of the array
        

        // ***** CHECKPOINT 4 *****
        // Find/print the smallest number in the array


        //System.out.println("The minimum element is "+???);


        // ***** CHECKPOINT 5 *****
        // Find/print the percentage of numbers that is even


        //System.out.println("The percentage of even numbers is "+???);


        // ***** CHECKPOINT 6 *****
        // Compute/print the percentage of numbers in the range -300 to 300


        //System.out.println(
        //  "The percentage of numbers in the range -300..300 is "+???);


        // ***** CHECKPOINT 7 *****
        // Sort the numbers and print them out
        
        
        // ***** CHECKPOINT 8 *****
        // Print the sorted numbers up to 10 per line
    }
    
    /*
    * Justification: Changed/Added Documentation here. Initial Documentation had something 
    * about asking the user for a file name, which is confusing considering it never asks
    * for that, only a positive number, which is what I replaced it with. I also put a comment 
    * on what the return statement did.
    * 
    */
    private static int getNumElements() {
        Scanner keyboard = new Scanner(System.in); // set up for keyboard input

        // prompt user for input of positive number
        System.out.print("Number of elements: ");
        System.out.flush();
        
        // returns input of user
        return keyboard.nextInt();
    }

    /*
    * Justification: Added Documentation here, mainly discussing what is being returned.
    *
    *
    */
   private static int[] createNumberArray(int numElements) {
        Random rand = new Random();
        
        // returns an int array of size numElements with random values from -1000 to 1001
        return rand.ints(numElements, -1000, 1001).toArray();
    }
}
