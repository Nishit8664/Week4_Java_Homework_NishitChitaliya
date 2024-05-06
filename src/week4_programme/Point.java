package week4_programme;

/**
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two
 * fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters x and y of type int and it needs to initialize the
 * fields.
 * Write the following methods (instance methods):
 * * Method named getX without any parameters, it needs to return the value of x field.
 * * Method named getY without any parameters, it needs to return the value of y field.
 * * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * * Method named distance without any parameters, it needs to return the distance between this
 * Point and Point 0,0 as double.
 * * Method named distance with two parameters x, y both of type int, it needs to return the distance
 * between this Point and Point x,y as double.
 * * Method named distance with parameter another of type Point, it needs to return the distance
 * between this Point and another Point as double.
 * How to find the distance between two points?
 * To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * Where √ represents square root.
 */
public class Point {
    int x, y;

    public Point() {                                        //No parameter constructor
    }

    public Point(int x, int y) {                            //2 parameter constructor
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }

    public int getX() {                                     //getX method
        return x;
    }
    /*
    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }
    */

    public int getY() {                                     //getY method
        return y;
    }

    public double distance() {
        return Math.sqrt((x - 0.0) * (x - 0.0) + (y - 0.0) * (y - 0.0));
    }

    public double distance(int x, int y) {
        return Math.sqrt((getX() - x) * (getX() - x) + (getY() - y) * (getY() - y));
    }

    public double distance(Point another) {
        return Math.sqrt((getX() - another.getX()) * (getX() - another.getX()) + (getY() - another.getY()) * (getY() - another.getY()));
    }
}

