package exception.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainV1 {

    public static void main(String[] args) throws IOException {
        //NetworkServiceV1_1 networkService = new NetworkServiceV1_1();
        //Net workServiceV1_2 networkService = new NetworkServiceV1_2();
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            System.out.print("전송할 문자: ");
            String input = br.readLine();
            if (input.equals("exit")){
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
