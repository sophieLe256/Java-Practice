package OOP.Point;
import java.lang.Math;

/**
 * You have to represent a point in 2D space. Write a class with the name Point.
 * The class needs two fields (instance variables) with name x and y of type int.
 *
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor).
 * The second constructor has parameters x and y of type int and it needs to initialize the fields.
 *
 * Write the following methods (instance methods):
 *
 * Method named getX without any parameters, it needs to return the value of x field.
 *
 * Method named getY without any parameters, it needs to return the value of y field.
 *
 * Method named setX with one parameter of type int, it needs to set the value of the x field.
 *
 * Method named setY with one parameter of type int, it needs to set the value of the y field.
 *
 * Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
 *
 * Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
 *
 * Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.
 *
 * How to find the distance between two points?
 * To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:
 * d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
 * Where √ represents square root.
 */
public class Point {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private int y;

    public Point(){

    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    //calculate the distance between points x,y and 0,0
    public double distance(){
        return Math.sqrt((this.x - 0) * (this.x -0) + (this.y - 0) * (this.y - 0));
    }

    //calculate the distance between points x,y and x1, y1
    public double distance(double x1, double y1){
        return Math.sqrt((this.x - x1) * (this.x -x1) + (this.y - y1) * (this.y - y1));
    }

    //calculate the distance between points x,y and Point
    public double distance(Point p){
        return Math.sqrt((this.x - p.x) * (this.x -p.x) + (this.y - p.y) * (this.y - p.y));
    }
}
