/* A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes  */

public class Constructors {
    int modelYear;
  String modelName;

  public Constructors(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Constructors myCar = new Constructors(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}//Outputs 1969 Mustang

/* Note that the constructor name must match the class name, and it cannot have a return type (like void).

Also note that the constructor is called when the object is created
 */
//Constructors can also take parameters, which is used to initialize attributes.


