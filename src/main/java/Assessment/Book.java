package Assessment;

public class Book {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;

    public static void main(String[] args) {
        Book book1= new Book();
        book1.setTitle("Atomic habits");
        System.out.println("Book1 title : "+book1.getTitle());
        Book book2 = new Book();
        book2.setTitle("Psychology of money");
        System.out.println("Book2 title : "+book2.getTitle());
        book1.setAuthor(" Atomic habit's author");
        System.out.println("Book1 author : "+book1.getAuthor());
        book2.setAuthor("John");
        System.out.println("Book2 author : "+book2.getAuthor());
        book1.setPrice(300);
        System.out.println("Book1 price : "+book1.getPrice());
        book2.setPrice(250);
        System.out.println("Book2 price : "+book2.getPrice());
    }
}
