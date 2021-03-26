package L08_Iterators_And_Comparators_Lab.P02Library;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("First book", 2000, "Gosho");
        Book book2 = new Book("Second book", 1993, "Pesho", "Mesho");
        Book book3 = new Book("Third book", 1900, "Marko", "Polo", "Aishe");

        Library<Book> books = new Library<>(book, book2, book3);

        for (Book boo : books) {
            System.out.println(boo.getTitle());
        }
    }
}