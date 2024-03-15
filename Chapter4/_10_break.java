package chap4;

public class _10_break {
    public static void main(String[] args) {
        //break
        //치킨 집에서 매일 20마리만 판매 (인당 1마리 판매)
        //손님 50명 대기

        //for 문
        int max = 20;
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i+"번 손님 치킨 나왔습니다");
            if (i == max){
                System.out.println("금일 재료가 모두 소진");
                break; // 반복문 탈출 이해 안되면 break 없애봐

            }
            System.out.println("영업 종료");

            System.out.println("-----------------");

            //while문
            int index = 1; // 손님대기번호
            while (index<= 50){
                System.out.println(index+"번 손님 치킨 나옴");
                if(index ==max){
                    System.out.println("재료소진 영업끝");
                    break;
                }
                index++;
            }
            System.out.println("영업종료합니다.");
        }
    }
}
