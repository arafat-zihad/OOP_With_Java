public class Book{
    String title;
    String author;
    int number_of_page;

    public Book(String title, String author, int number_of_page) {
        this.title = title;
        this.author = author;
        this.number_of_page = number_of_page;
    }

    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + number_of_page);
    }

    
}