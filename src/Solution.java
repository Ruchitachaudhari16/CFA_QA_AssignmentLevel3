import java.util.Scanner;

class Solution extends Calculator
{/*UC1: create a calculator and apply all  features of Abstract class
    Need  to create made add(),multiply(), divide(), Subtract()  as abstract methods in parent class which are defined in child class and we can call all these methods via making object of child class.as abstract methods in parent class which are defined in child class and we can call all these methods via making object of child class.
    */
    int numberOne=30, numberTwo=5, result;

        void addition() //Method implementation of abstract class
        {
            result = numberOne + numberTwo;
            System.out.println("Addition Result is :"+result);
        }
    void subtraction()
    {
        result = numberOne - numberTwo;
        System.out.println("Subtraction Result is :"+result);
    }


    void division() {
        result = numberOne/ numberTwo;
        System.out.println("division Result is :"+result);
    }

    void multiplication()
        {
            result = numberOne * numberTwo;
            System.out.println("Multiplication Result:"+result);
        }

        public static void main(String[] args)
        {
            Solution obj = new Solution();
            obj.addition();
            obj.subtraction();
            obj.multiplication();
            obj.division();
        }
    }

