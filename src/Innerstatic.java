public class Innerstatic {
    /*UC2:-Java Program to Illustrates Use of Static Inner Class.
made an Outer class and define a static Inner class in it.
We define a non-static method as the show() method in inner class and we try to call this method by inner class object and
outer class object and we get the desired output.*/

        static int a =1000;
        static class Inner{ //Show method in a inner class.
            void show(){System.out.println("Show method with  integer value:-"+a);}
        }
        public static void main(String args[]){
            Innerstatic.Inner  innerobj=new Innerstatic.Inner();
            innerobj.show();
        }
    }

