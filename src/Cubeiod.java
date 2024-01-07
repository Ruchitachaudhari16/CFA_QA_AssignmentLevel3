import java.util.Scanner;

public class Cubeiod{
    /*Java Program to Create a Method without Parameters and with Return Type
We have made a method to calculate the volume of a cuboid which takes the dimensions length, breadth and height as input and
 returns the volume as output back to the main method.*/

    double width;
    double height;
    double depth;
    double volume()  //Volume method withot parameters.
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Width of Cube : ");
        double width = s.nextDouble();
        System.out.print("Height of Cube: ");
        double height = s.nextDouble();
        System.out.print("Depth Of Cube:");
        double depth = s.nextDouble();
        return width * height * depth;
    }
}
class Result
{
    public static void main(String args[])
    {
        Cubeiod cuboid = new Cubeiod();
        double volume;
        volume = cuboid.volume();
        System.out.println("Volume of cubeiod is " + volume);
    }
}
