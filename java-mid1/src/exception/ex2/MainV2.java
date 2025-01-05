package exception.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainV2 {

    public static void main(String[] args) throws IOException, NetworkClientExceptionV2 {
        // NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
        //NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
        //NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
        //NetworkServiceV2_4 networkService = new NetworkServiceV2_4();
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5();

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
