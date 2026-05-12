package Constructor;

public class book {

    String title;
    int price;

    book(String title, int price){
        this.title = title;
        this.price = price;
    }

    public static void main(String[] args) {
        book obj = new book("java Programming", 500);
        book obj1 = new book("Python Programming", 700);
        book obj2 = new book("Python Programming", 700);
        book obj3 = new book("C Programming", 1000);

        System.out.println("=================================================================");
        System.out.println("Title\t\t\tPrice");
        System.out.println("=================================================================");
        System.out.println(obj.title+"\t\t\t"+obj.price);
        System.out.println(obj1.title+"\t\t\t"+obj1.price);
        System.out.println(obj2.title+"\t\t\t"+obj2.price);
        System.out.println(obj3.title+"\t\t\t"+obj3.price);

    }
}
