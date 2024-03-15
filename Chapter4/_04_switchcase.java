package chap4;

public class _04_switchcase {
    public static void main(String[] args) {
        //switch case
        //1등 전액 장학금 , 2등 반액 장학금, 3등 반액장학금,그외엔 없음

        int ranking = 1; //1등
        if (ranking ==1){
            System.out.println("전액 장학금");
        }else if (ranking ==2 || ranking==3){
            System.out.println("반액 장학금");
        }else if (ranking ==3){
            System.out.println("반액 장학금");
        }else {
            System.out.println("장학금 없음");
        }
        System.out.println("조회완료");
    }
    //switch 문
//    switch (expression){
//        case A: ... 수행할 명령 ...
//            break;
//        case B: ... 수행할 명령 ...
//            break;
//        case C: ... 수행할 명령 ...
//            break;
//            ...
//        default : ... 수행할 명령 ...
//    ranking = 1;
//    switch (ranking){
//        case 1:
//            System.out.println("전액장학금");
//            break;
//        case 2:
//            System.out.println(("반액 장학금"));
//            break;
//        case 3:
//            System.out.println("반액 장학금");
//            break;
//        default:
//            System.out.println("장학금 없");
//
    }

