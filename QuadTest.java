class Quadrilateral {
        int length, breadth;
        Quadrilateral(int l, int b) {
            length = l;
            breadth = b;
        }

        Quadrilateral() {
         }

    void displayDim() {
            System.out.println("length is " + length);
            System.out.println("breadth is " + breadth);
        }
}

class Rectangle extends Quadrilateral {
        Rectangle(int l, int b) {
            super(l, b);
        }
        void area() {
            System.out.println("area of Rectangle is " + length * breadth);
        }
        void perimeter() {
            System.out.println("perimeter of Rectangle is " + 2 * (length + breadth));
        }
}
class Cube extends Quadrilateral {
    int height;
   Cube(int h){
        this.height = h;
        //super(h, h);

    }

    void volume() {
            System.out.println("Volume of Cube is " + height * height * height);
        }
        void displayDim() {
            System.out.println("Height of cube is " + height);
        }
    }
public class QuadTest {
            public static void main(String[] args) {
                Rectangle rect1 = new Rectangle(10, 8);
                Rectangle rect2 = new Rectangle(15, 16);
                Cube c1 = new Cube(8);
                Cube c2 = new Cube(4);
                System.out.println("");

                rect1.area();
                rect1.perimeter();
                rect1.displayDim();

                System.out.println("");

                rect2.area();
                rect2.perimeter();
                rect2.displayDim();

                System.out.println("");

                c1.volume();
                c1.displayDim();

                System.out.println("");

                c2.volume();
                c2.displayDim();




            }
}
