import java.lang.*;
public class Book {
    private String name;
    private int amountPage;
    public Book(String n, int a){
        name = n;
        amountPage = a;
    }
    public Book(String n){
        name = n;
        amountPage = 0;
    }
    public Book(){
        name = "Код да Винчи";
        amountPage = 350;
    }
    public void setAmountPage(int amountPage) {
        this.amountPage = amountPage;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAmountPage() {
        return amountPage;
    }
    public String toString(){
        return this.name+", amount page "+this.amountPage;
    }
    public void printClass(){
        System.out.println(name  + " - книга, в которой "+ amountPage + " страниц");
    }
}