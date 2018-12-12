public class Main {
    public static void main (String[] args) {
        Book b1 = new Book("Кэрри", 220);
        Book b2 = new Book("ОНО", 1274);
        Book b3 = new Book("Противостояние");
        b3.setAmountPage(1350);
        System.out.println(b1);
        b1.printClass();
        b2.printClass();
        b3.printClass();
    }
}
