package chap4;

public class _01_if {
    public static void main(String[] args) {
        //조건문if
        int hour = 10; //오전 10시
        if (hour < 14)
            System.out.println("아이스 아메리카노 +1");
        System.out.println("커피 주문 완료");
        //하나의 sout만 쓰면 {} 중가로 없어도 되지만 많아지면 써야 함
        if(hour < 14) {
            System.out.println("아이스 아메리카노+1");
            System.out.println("샷추가");
        }
        System.out.println("주문 완료");

        //오후 2시 이전 모닝 커피를 마시지 않은 경우
        hour = 10;
        boolean morningCoffee= false; // 모닝커피
        if (hour <= 14 && morningCoffee == false);
        System.out.println("아이스 아메리카노+1");
        System.out.println("커피 주문 완료1");

        //오후 2시 이후이거나 모닝 커피를 마신 경우
        hour = 15;
        morningCoffee = true;
        if (hour >= 14 || morningCoffee == true);
        System.out.println("아아(디카페인) +1");
        System.out.println("커준완");
        // 4:07:13

    }


}
