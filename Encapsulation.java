/* The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

    declare class variables/attributes as private
    provide public get and set methods to access and update the value of a private variable
 */
//The get method returns the variable value, and the set method sets the value.
//Instead, we use the getName() and setName() methods to access and update the variable.

public class Encapsulation {
    public static void main(String[] args) {
      Encapsulation myObj = new Encapsulation();
      myObj.setName("John"); // Set the value of the name variable to "John"
      System.out.println(myObj.getName());
    }

    private char[] getName() {
        return null;
    }

    private void setName(String string) {
    }
  }
  
  // Outputs "John"
  