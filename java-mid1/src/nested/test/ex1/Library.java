package nested.test.ex1;

import java.util.Arrays;

public class Library {

    private int capacity;
    private int count = 0;
    private Book[] books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new Book[capacity];
    }

    public void addBook(String title, String author) {
        // 검증 로직을 다 처리하고
        if (count >= capacity) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        // 정상 로직을 처리
        Book newBook = new Book(title, author);
        books[count++] = newBook;
    }

    public void showBooks() {
        System.out.println("==책 목록 출력==");
        for (Book book : books) {
            System.out.println("제목 : " + book.title + ", 작가 : " + book.author);
        }
    }

    private static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
