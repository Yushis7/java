package Chap2;

public class _01_Operator1 {
    public static void main(String[] args) {
//        String name = "1234";
//        System.out.println("버스 "+name+"이 곧 도착합니다");
//        String minute = "3";
//        System.out.println(""+minute+"분 후 도착합니다");
//        String km = "1.5";
//        System.out.println(""+km+"km 남았습니다");

        //산술연산자

        //일반연산
        System.out.println(4+2); // 6
        System.out.println(4-2); // 2
        System.out.println(4*2); // 8
        System.out.println(4/2); // 2
        System.out.println(5/2); //2.5안나오고 2로 나옴(정수만 나오고 실수 안나옴)
        System.out.println(2/4); //0.5 마찬가지로 0 나옴
        System.out.println(4%2); //0 나머지
        System.out.println(5%2); // 1 나머지

        //우선 순위 연산
        System.out.println(2+2*2); // 6
        System.out.println((2+2)*2); //8
        System.out.println(2+(2*2)); // 6

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;
        c= a+b;
        System.out.println(c); //30

        c=a-b;
        System.out.println(c); //10

        c=a*b;
        System.out.println(c); // 200

        c=a/b;
        System.out.println(c); // 2

        c=a%b;
        System.out.println(c); // 0

        //증감 연산 ++,--
        int val;
        val = 10;
        System.out.println(val); // 10
        val++;
        ++val;

        val=10;
        System.out.println(val); //10
        System.out.println(++val); //11
        System.out.println(val); // 11
        //++을 한 채로 하면 1+val로 11이 되고 그다음엔 그대로 유지

        val=10;
        System.out.println(val); //10
        System.out.println(val++); //10 val+1이여서 당장은 안됨
        System.out.println(val); // 11 이젠 됨

        val=10;
        System.out.println(val); //10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val=10;
        System.out.println(val); //10
        System.out.println(val--); //10
        System.out.println(val); // 9

        //은행 대기표 같은 상황에서 써먹음
        int waiting = 0;
        System.out.println("대기인원 : "+waiting++ ); //대기 0명
        System.out.println("대기인원 : "+waiting++ ); //대기 1명
        System.out.println("대기인원 : "+waiting++ ); //대기 2명
        System.out.println("총 대기 인원 : "+waiting ); //총 대기 3명





    }
}
