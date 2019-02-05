package com.techelevator;

public class Lecture {

    /*
    1. Return the created array
    */
	// Return type here is returning an array instead of a single integer
    public int[] returnArray() {
        int[] array = {80,8080,443};
        
        // Changed to return array variable

        return array;
    }

    /*
    2. Return the first element of the array
    */
    public int returnFirstElement() {
        int[] portNumbers = {80,8080,443};

        // Asking for FIRST element (or index) of array

        return portNumbers[0];
    }

    /*
    3. Return the last element of the array
    */
    public int returnLastElement() {
        int[] portNumbers = {80,8080,443};
        // Use length to quickly return LAST array
        return portNumbers[portNumbers.length - 1];

//        int[] portNumbers = {80,8080,443 };
//        return portNumbers[2];
    }

    /*
    4. Return the first element of the array from the parameters
    */
    public int returnFirstElementOfParam(int[] passedInArray) {
    	// We know there is int, and that it is an array, nothing else
    	// We always know the first element
        return passedInArray[0];
    }

    /*
    5. Return the last element of the array from the parameters
    */
    public int returnLastElementOfParam(int[] passedInArray) {
    	// Same here, do not know the length
        return passedInArray[passedInArray.length - 1];
        
//        return passedInArray[ passedInArray.length - 1 ];
    }
    
    /*
    6. Here, a variable is defined within a block. How can we get the value of that outside of the block in order to return it? There are a couple of different ways of doing this, what can you come up with?
    */
    public int returnVariableFromBlock(int number) {
    	int result;
        { // A new block with scoped variables
          // Change scope of block and change where the variable is defined
          // Variable does not HAVE to be defined and declared in the  
        	
            result = number * 5;
    	
        { // A new block with scoped variables

            number = number * 5;


        } // the result variable disappears here

        return result; // We want to return result here. How?
        }
   }

    /*
    7. What will the variable result be at the end of the method? Change the number in the logic expression so that it returns true.
    */
    public boolean returnOperationInBlock() {
        int result = 5;

        {
            int multiplier = 10;
            result *= multiplier;
        }

        return (result == 50); // <-- Change the number to match result and make this be true
    }

    /*
    8. Return the only variable that is in scope at the return statement.
    */
    public double returnInScopeVariable() {
    	// only one is available here
        double one = 1.0;
        {
            double three = 3.0;
            one += three;
            {
                double four = 4.0;
                three = four - one;
                one++;
            }

            double five = 5.0;
            double eight = five + three;
        }

        return one;
    }

    /*
    9. How many times do we go through this loop? Change the number in the logic expression so that it returns true.
    */
    public boolean returnCounterFromLoop() {

        int[] arrayToLoopThrough = {3, 4, 2, 9};

        int counter = 0; // Must be started outside the block so that have access to it after the block
        // if you put i outside it can be returned
        for(int i = 0; i < arrayToLoopThrough.length; i++) {
            counter++;
        }

        return (counter == 4); // What should the number be to return true?
    }

    /*
    10. This loop is counting incorrectly. What needs to change in the loop for it to count properly?
    */
    public boolean returnCorrectCount() {
        int[] arrayToLoopThrough = {4, 23, 9};

        int counter = 0;

        //     Start;       Keep going while         Increment by one;

        // i was i = 1, it must start at 0 to count ALL items
        // i might start at 1 because there is a header

        for(int i = 0; i < arrayToLoopThrough.length; i++) {
            counter += 1;
        }

        return (counter == 3);
    }

    /*
    11. This loop is counting incorrectly. What needs to change in the loop for it to count properly?
    */
    public boolean returnCountCorrectTimes() {
        int[] arrayToLoopThrough = {4, 23, 9, 4, 33};

        int counter = 0;
        
        // Or for(int i = 0; i < arrayToLoopThrough.length; i++) {
        //     Start;       Keep going while         Increment by one;

//        for(int i = 0; i <= arrayToLoopThrough.length - 1; i++) {

        for(int i = 0; i < arrayToLoopThrough.length; i++) {

            counter = counter + 1;
        }

        return (counter == 5);
    }

    /*
    12. We want this loop to only count every other item starting at zero. What needs to change in the loop for it to do that?
    */
    public boolean returnSumEveryOtherNumber() {
        int[] arrayToLoopThrough = {4, 3, 4, 1, 4, 6};

        int sum = 0;
        // Changed incrementer from 1 to 2 
        //     Start;       Keep going while       Increment by;
        for(int i = 0; i < arrayToLoopThrough.length; i = i + 2) {
            sum = sum + arrayToLoopThrough[i];
        }

        return (sum == 12);
    }
}