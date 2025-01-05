package exception.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainV3 {

    public static void main(String[] args) throws IOException {
        //NetworkServiceV3_1 networkService = new NetworkServiceV3_1();
        NetworkServiceV3_2 networkService = new NetworkServiceV3_2();

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

        br.close();
    }
}
