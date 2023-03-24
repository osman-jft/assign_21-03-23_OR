class Quadrilateral
{
    int length;
    int breadth;

    Quadrilateral(int length, int breadth) //constructor
    {
        this.length = length;
        this.breadth = breadth;
    }

    public String dispDimension() //display dimensions
    {
        return "\nLength : " + this.length + " Breadth : " + this.breadth;
    }
}
class Rectangle extends Quadrilateral//Rectangle which inherits Quadrilateral
{


    Rectangle(int length, int breadth)
    {
        super(length, breadth);

    }
   //calculating area and perimeter.
    public int area()
    {
        return length * breadth;
    }
    public int perimeter()
    {
        return 2*(length + breadth);
    }
}
class Cuboid extends Quadrilateral
//Cube
{
    int height;
//chnage cube to cuboid

    Cuboid(int h, int l, int b)
    {
        super(l, b);
        this.height = h;
    }
    //calculating volume and displaying dimensions.
    public int volume()
    {
        return height * length * breadth;
    }

    public String dispDimension()
    {
        return super.dispDimension() + " height: " + this.height;
    }


}
public class QuadTest //Class with main function
{
    public static void main(String [] args)
    {

        Rectangle rect1 = new Rectangle(6 , 8);
        Rectangle rect2 = new Rectangle(5, 3);
        Cuboid cuboid1 = new Cuboid(5,6,7);
        Cuboid cuboid2 = new Cuboid(8,9,10);

        //create two Rectangle and two Cube objects, display their dimensions and
        //display the area & perimeter of the rectangles and volume of cubes.

        System.out.println("For Rectangle 1: ");
        rect1.dispDimension();
        System.out.println("area : " + rect1.area());
        System.out.println("perimeter : " + rect1.perimeter());

        System.out.println("For Rectangle 2: ");
        rect2.dispDimension();
        System.out.println("area : " + rect2.area());
        System.out.println("perimeter : " + rect2.perimeter());


        System.out.println("For Cuboid 1: ");
        System.out.println("Volume : " + cuboid1.volume());
        System.out.println("Dimensions :" + cuboid1.dispDimension());


        System.out.println("For Cuboid 2: ");
        System.out.println("Volume : " + cuboid2.volume());
        System.out.println("Dimensions : " + cuboid2.dispDimension());



    }
}