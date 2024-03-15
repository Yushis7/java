package chap4;

public class _12_quiz4 {
    public static void main(String[] args) {
         {
           int time = 5; // 주차 시간
            boolean smallcar = false; // 경차여부
            boolean disabledhuman = true; // 장애여부

            int fee =time*4000; // 시간당 요금

            //3만원 초과시 일일 최대 요금으로 수정
            if (fee> 30000){
                fee = 30000;
            }
            //경차 또는 장애인 차량인 경우 50% 할인
            if(smallcar || disabledhuman) {
                fee = fee/2;
            }
            //결과 출력
            System.out.println("주차 요금은 "+fee+"원 입니다.");

        }
    }
}
