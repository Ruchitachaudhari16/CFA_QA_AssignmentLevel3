public class Rectinter extends Circle{
    /* UC4 */
        int length = 0, breadth = 0;
        double area;
        public void input() //Input for reactangle
        {
            super.input();
            length = 6;
            breadth= 4;
        }
        public void area() //Area of recthangle
        {
            super.area();
            area = length * breadth;
            System.out.println("Area of rectangle:"+area);
        }
    }

