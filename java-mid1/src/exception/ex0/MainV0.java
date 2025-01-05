package exception.ex0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainV0 {

    public static void main(String[] args) throws IOException {
        NetworkServiceV0 networkService = new NetworkServiceV0();

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
