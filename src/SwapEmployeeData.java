public class SwapEmployeeData {
    /* UC5 :-Java Program to Swap Objects using Swap() Method
Make a swap method to interchange the information of two employees
using Employee Objects by passing them to swap() method.*/
    static String DataOne,DataTwo;
    SwapEmployeeData() //constructor  for class
    {
        DataOne = "Employee One Data";
        DataTwo = "Employee Two Data";
    }
    void swap(String a,String b) //Swap method
    {
        String result;
        result = a;
        a = b;
        b = result;
        System.out.println("Employee1:"+a);
        System.out.println("Employee2:"+b);
    }
    public static void main(String[] args)
    {
        SwapEmployeeData emp = new SwapEmployeeData();
        System.out.println("Before swapping:");
        System.out.println("Employee1:"+DataOne);
        System.out.println("Employee2:"+DataTwo);
        System.out.println("After swapping:");
        emp.swap(DataOne,DataTwo);
    }
}

