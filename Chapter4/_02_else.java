//package chap4;
//
//public class _02_else {
//    public static void main(String[] args) {
//        int hour = 10;
//
//        if (hour < 14) {
//            System.out.println("아이스 아메리카노+1");
//        } else { // 그외의 경우
//            System.out.println("아아(디카페인)+1");
//        }
//        System.out.println("주문완료");
//    }
//}
//
//package chap4;
//
//public class _02_else {
//    public static void main(String[] args) {
//        int hour = 15;
//
//        if (hour < 14)
//            System.out.println("아이스 아메리카노+1");
//         else  // 그외의 경우
//            System.out.println("아아(디카페인)+1");
//
//        System.out.println("주문완료");
//    } // {}중괄호 뺸 버전 내용이 많아지면 써야 함
//}

package chap4;

public class _02_else {
    public static void main(String[] args) {
        int hour = 15;
        boolean morningCoffee = true;
        if (hour >= 14 || morningCoffee == true) {
            System.out.println("아아디카 +1");
        } else {
            System.out.println("아아+1");
        }
        System.out.println("주문완료");


    }
}
