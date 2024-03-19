package chap6;

public class _01_Method {
    //메소드 정의
    public static void sayHello() {
        System.out.println("안녕하세요 메소드입니다");
    }






    public static void main(String[] args) {
        //메소드 (코드별 기능 묶음)
        System.out.println("메소드 호출 전");
        sayHello();//위에 메소드 정의해놓고 쓰기
        System.out.println("메소드 호출 후");
    }
}
