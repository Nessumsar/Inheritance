package se.ecutb.lukas.CarExtendsVehicle;

/**
 * Write a program in which you will define class named Vehicle with the associated properties.
 * After that define classes Car, Motor and Truck which will derive properties from class Vehicle
 * and have their own properties. Make function Drive which sholud be override in child
 * classes. After that make instances of the classes and call function Drive for every class.
 */
public class App 
{
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
