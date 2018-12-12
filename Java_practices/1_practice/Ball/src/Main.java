public class Main {
    public static void main (String[] args){
        Ball f1 = new Ball("Футбольный", 13);
        Ball f2 = new Ball("Волейбольный", 10);
        Ball f3 = new Ball("Баскетбольный");
        f3.setRadius(6);
        System.out.println(f1);
        f1.printClass();
        f2.printClass();
        f3.printClass();
    }
}
