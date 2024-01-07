public class Circle implements Shape  //SHape Interface
    {
        /*UC4:-*/
        int radius = 0;
        double pi = 3.14, area = 0;

        public void input()
        {
            radius = 5;
        }

        public void area() //Area of circle .
        {
            area = pi * radius * radius;
            System.out.println("Area of circle:"+area);
        }
    }

