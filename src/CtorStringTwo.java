public class CtorStringTwo extends  CtorString {
/*UC9:-Java Program to use of String Constructor
Constructor is used to initialize an object.
 make two classes as Super and Sub class using Inheritance.
 We initialize two different strings in the constructors of these two classes
 and with the help of the object of Subclass we print these strings.Java Program to Allocate and Initialize Super Class Members using Constructor
: */
        public  CtorStringTwo()  //ctor Derived class
        {
            System.out.println("Derived Class Constructor");
            b = "String from Derived Class";
        }
        public static void main(String arg[])
        {
           CtorStringTwo ctor = new CtorStringTwo();
            System.out.println("the strings initialised in the constructors of Base and Derived classes are :");
            System.out.println(ctor.a +" and "+ctor.b);
        }
    }

