public class BankAccount {
    /*UC3:-Create a class Bank Account and the Inner Class Interest in it
We declare the Outer class as BankAcct and the inner class as Interest. Now we
 use the variables declared in the outer class to get the output in the inner class.*/
    int principal = 125, rate = 10, time = 6;
    void test()
    {
        Interest inner = new Interest();
        inner.display();
    }
    class Interest   //Inner class
    {
        void display()
        {
            int simpleInterest = (principal * rate * time) / 100;
            System.out.println("Interest : " + simpleInterest + " Rs");
        }
    }
}

