package poly.ex2;

public class Dog extends Animal{
    @Override                   //Ctrl + O : 오버라이딩 단축키
    public void sound() {
        System.out.println("멍멍");
    }
}
