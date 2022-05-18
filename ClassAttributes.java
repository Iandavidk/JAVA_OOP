public class ClassAttributes {
    //Another term for class attributes is fields.

    int x = 10;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 25; // x is now 25
    System.out.println(myObj.x);
  }
  //If you don't want the ability to override existing values, declare the attribute as final.
}
