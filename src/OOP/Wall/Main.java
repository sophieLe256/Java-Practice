package OOP.Wall;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        Wall wall1 = new Wall(0,6);
        Wall wall2 = new Wall(1.125,-1.0);

        System.out.println("area= " + wall2.getArea());
        wall.setHeight(-1.5);
        wall.setWidth(-1.5);
        System.out.println("width= " + wall2.getWidth());
        System.out.println("height= " + wall2.getHeight());
        System.out.println("area= " + wall1.getArea());
    }
}
