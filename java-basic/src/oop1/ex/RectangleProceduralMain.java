package oop1.ex;

public class RectangleProceduralMain {

    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        int area = calcuateArea(width, height);
        System.out.println("넓이: " + area);

        int perimeter = calculatePerimeter(width, height);
        System.out.println("둘레: " + perimeter);

        boolean square = isSquare(width, height);
        System.out.println("정사각형 여부: " + square);
    }

    static int calcuateArea(int width, int height) {
        return width*height;
    }
    static int calculatePerimeter(int width, int height) {
        return (width*2 + height*2);
    }
    static boolean isSquare(int width, int height) {
        return width == height;
    }
}
