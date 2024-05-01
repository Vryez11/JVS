package oop1.ex;

public class Retangle {
    int width;
    int height;
    int area;
    int perimeter;
    boolean isSquare;
    int calculateArea() {
        return width*height;
    }
    void calculatePerimeter() {
        perimeter = width*2 + height*2;
        System.out.println("둘레: "  +  perimeter);
    }
    void isSquare() {
        isSquare = (width == height);
        if (isSquare) System.out.println("정사각형입니다.");
        else System.out.println("정사각형이 아닙니다.");
    }
}
