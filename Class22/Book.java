package Class22;

public class Book {
    String title;
    String author;
    int year;
    double price;

    void read(){
        System.out.println("I am reading " + title+" book by "+author); //method is block of code reusuable.
    }
    void changePrice(int newPrice){
        System.out.println("The price of the book "+title+" was changed from "+price+" to "+newPrice);

    }
    double totalWithTax(double tax){
        double total=price+(price*tax);
        return total;

    }
}
