package Tutoring_Assignment;


class Point {
    private int x, y;
    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x =x; this.y = y; }
}

//[1번]
class ColorPoint extends Point {
    String color;
    //기본생성자
    public ColorPoint() {
        super(0,0);
        this.color = "BLACK";
    }
    public ColorPoint(int x,int y,String color) {
        super(x,y);
        this.color = color;
    }
    public ColorPoint(int x,int y) {
        super(x,y);
    }
    protected void setXY(int x,int y) {
        super.move(x,y);
    }
    protected void setColor(String color1) {
        this.color = color1;
    }
    public String toString() {
        return color+"색의 ("+getX()+","+getY()+")의 점";
    }

}

public class TestColorPoint {
    public static void main(String[] args) {
        //[5번]
        ColorPoint cp5 = new ColorPoint(5, 5, "YELLOW");
        cp5.setXY(10, 20);
        cp5.setColor("RED");
        String str = cp5.toString();
        System.out.println(str+"입니다. ");

        //[6번]
        ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
        System.out.println(zeroPoint.toString() + "입니다.");
        ColorPoint cp6 = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
        cp6.setXY(5,5);
        cp6.setColor("RED");
        System.out.println(cp6.toString()+"입니다.");
    }
}
