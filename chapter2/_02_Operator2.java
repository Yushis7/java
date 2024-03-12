package Chap2;

public class _02_Operator2 {
    public static void main(String[] args) {
        //대입 연산자
        int num = 10;
        num = num+2;
        System.out.println(num); // 12

        num = num-2;
        System.out.println(num); // 10 12-2로 위에꺼에서 이어짐

        num = num*2;
        System.out.println(num); // 20

        num = num/2;
        System.out.println(num); // 10

        num = num%2;
        System.out.println(num); // 0

        //복합 대입 연산자
        num = 10; //num = num+2
        num +=2;
        System.out.println(num);
        num -=2;
        System.out.println(num);
        num *=2;
        System.out.println(num);
        num /=2;
        System.out.println(num);
        num %=2;
        System.out.println(num); //위에 대입연산자랑 같음 좀 더 간단할 뿐


    }
}
