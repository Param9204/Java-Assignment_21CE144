//I'd:21CE144
//Name:Param Thumar
//Design an interface named Colorable with a void method named howToColor(). Every class of a colorable object must implement the Colorable interface. Design a class named Square that extends GeometricObject and implements Colorable. Implement howToColor to display the message Color all four sides. The Square class contains a data field side with getter and setter methods, and a constructor for constructing a Square with a specified side. The Square class has a private double data field named side with its getter and setter methods. It has a no-arg constructor to create a Square with side 0, and another constructor that creates a Square with the specified side
interface Colorable {
    static void howToColor() {
    }
}

class GeometricObject1 implements Colorable {
    static void howToColor() {
        System.out.println("Color of the each side is Green");
    }
}

class Square extends GeometricObject1 {
    private double side1 = 0;

    Square() {
        System.out.println("The Default Squre is :");
        System.out.println("The area of square is : " + side1 * side1);
        System.out.println();
    }

    public double getside1() {
        return side1;
    }

    public void setside1(double side1) {
        this.side1 = side1;
    }

    public void area() {
        System.out.println("The Square Successfully Created!!!!");
        System.out.println("The area of square is : " + this.side1 * this.side1);
    }
}

class pr9 extends GeometricObject1 {
    public static void main(String[] args) {
        Square s = new Square();
        pr9 p = new pr9();
        s.howToColor();
        s.setside1(10);
        s.getside1();
        s.area();
        System.out.println("Prepared by 21CE144_Param");
    }
}
