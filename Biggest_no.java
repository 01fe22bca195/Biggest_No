/**
 * The "Biggest_no" class finds the largest number in an array of integers and prints it.
 */
// The `class Biggest_no` is defining a Java class that finds the largest number in an array of
// integers and prints it.
class Biggest_no{
  // The `public static void main(String[] args)` is the main method in Java. It is the entry point of
  // the program and is where the program starts executing. It is a special method that is required in
  // every Java program.
    public static void main(String[] args) {
     // The code `int number,BiggestNo,size=10;` is declaring three integer variables: `number`,
     // `BiggestNo`, and `size`. `size` is initialized with the value 10.
        int number,BiggestNo,size=10;
        int[] Array = {0,1,2,3,4,5,6,7,-1,-7};
      // The code is finding the largest number in the `Array` by iterating through each element of the
      // array.
        BiggestNo = Array[0];
        for ( number = 1; number < size; number++) {
            if (Array[number] > BiggestNo){
                BiggestNo = Array[number];
            }
}
// The code `System.out.println("The biggest number is: " +BiggestNo);` is printing the message "The
// biggest number is: " followed by the value of the variable `BiggestNo`. It is used to display the
// largest number found in the array.
System.out.println("The biggest number is: " +BiggestNo);
    }
}


