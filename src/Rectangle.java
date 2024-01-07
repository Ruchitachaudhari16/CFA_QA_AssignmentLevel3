import java.util.Scanner;

public class Rectangle {
    /*UC7:-Create a Method with 2 Parameters and without Return Type
Enter the length and breadth of the rectangle as input. Now we pass these values as parameters to the new method
where we calculate the area and print the output. */

    double length;
    double breadth;
    void rectangleArea(double length,double breadth)//Method with 2 param
    {
        double area = length * breadth;
        System.out.print("area of the rectangle is :"+area);
    }
}
class ParameterDemo
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter length : ");
        double l = s.nextDouble();
        System.out.print("enter breadth : ");
        double b = s.nextDouble();
        Rectangle rec = new Rectangle();
        rec.rectangleArea(l,b);
    }
}

