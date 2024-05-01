package scope;

public class Scope3_2 {

    public static void main(String[] args) {
        int m = 10;

        if(m > 0) {
            int temp = m * 2; //코드 안에서 변수 선언해서 if 문이 끝날 시 같이 변수 소멸 -> 1. 효율적인 메모리 2. 코드를 단순하게!
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}


//Ctrl + N : 파일 찾지, Ctrl + E , 바로 Enter : 직전 문서 바로 가기 (Recent Files)