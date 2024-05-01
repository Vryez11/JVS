package oop1.ex;

public class RetangleOopMain {
    public static void main(String[] args) {
        Retangle retangle = new Retangle();
        retangle.width = 5;
        retangle.height = 8;

        int area = retangle.calculateArea();
        System.out.println("면적: " + area);

        retangle.isSquare();

        retangle.calculatePerimeter();
    }
}
