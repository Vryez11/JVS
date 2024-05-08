package extends1.ex;

public class Book extends Item {

    private String author;
    private String isbn;

    Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {                       //Ctrl + O : 부모 클래스에서 오버라이딩할 것을 클릭 후 자동으로 만들어줌! 편함!
        super.print();
        System.out.println(" -작가: " + author + ", 일련번호: " + isbn);
    }


}
