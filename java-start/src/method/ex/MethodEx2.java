package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        printMessage("hello", 5);
    }

    public static void printMessage(String Message, int times) {
        for (int i = 0; i < times; i++){
            System.out.println(Message);
        }
        return;
    }
}
