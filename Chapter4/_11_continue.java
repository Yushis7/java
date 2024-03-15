package chap4;

public class _11_continue {
    public static void main(String[] args) {
        //continue

        //치킨 주문 손님 중 노쇼 손님이 있다고 가정
        //for
        int max = 20; // 최데 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noshow= 17; // 17번 손님이 노쇼했다 가정
        for (int i = 1; i < 50; i++) {
            System.out.println(i+"번 손님 치킨 나왔음");

            if (i == noshow){
                System.out.println(i+"번 손님 노쇼로 인해 다음으로 넘어감");
                continue;
            }

            sold++;//판매처리
            if (sold ==max){
                System.out.println("금일 재료 모두 소진 됨");
                break;
            }

        }
        System.out.println("영업을 종료 합니다");

        System.out.println("---------------");
        sold = 0;
        int index = 1; //손님 번호
        while (index <= 50) {
            System.out.println(index + "번 손님 주문하신 치킨 나왔다");
            sold++; // 판매처리
            if (sold == max){
                System.out.println("금일 재료 모두 소진 2");
                break;
            }
            index++;
        }
        System.out.println("영업 종료 2");
    }
}
