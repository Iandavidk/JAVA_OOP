/* When an error occurs, Java will normally stop and generate an error message. The technical term for this is: Java will throw an exception (throw an error). 

The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

The try and catch keywords come in pairs

*/

public class Exceptions {
    public static void main(String[ ] args) {
      try {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]);
      } catch (Exception e) {
        System.out.println("Something went wrong.");
      }
    }
  }
