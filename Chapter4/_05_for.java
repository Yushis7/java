package chap4;

public class _05_for {
    public static void main(String[] args) {
        //반복문 for
        // for(선언;조건;증감) {}
        for(int i = 0; i<10; i++){
            System.out.println("어서오세요.나코입니다"+i);
        }
        // fori 치면 알아 나옴
        for (int i = 0; i < 10; i+=2) {
            System.out.print(i); // 짝수만 출력
        }
        System.out.println();
        for (int i = 1; i <10 ; i+=2) {
            System.out.print(i); //홀수만 출력
        }
        System.out.println();

        for (int i = 5; i >0 ; i--) {
            System.out.print(i); // 54321 거꾸로 출력
        }
        int sum = 0;
        for (int i = 1; i <=10 ; i++) {
            sum += i;
            System.out.println("현재까지 총합은 "+sum+"입니다");
        }
        System.out.println("1부터 10까지의 합은"+sum+"입니다");
        } // 1~10까지 더하기 만들기
    }
