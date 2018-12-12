import java.lang.*;
public class Ball {
    private String type;
    private int radius;
    public Ball(String n, int a){
        type = n;
        radius = a;
    }
    public Ball(String n){
        type = n;
        radius = 5;
    }
    public Ball(){
        type = "Football";
        radius = 15;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType(String name){
        return type;
    }
    public int getRadius() {
        return radius;
    }
    public String toString(){
        return this.type+", radius "+this.radius;
    }
    public void printClass(){
        System.out.println(type  + " мяч с диаметром "+ (radius * 2) + " сантиметра");
    }
}