package Chap3;

public class _04_escapeSequance {
    public static void main(String[] args) {
        //특수문자,이스케이프 문자(escape,sequence,escape,Character,special 등)
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");//로 바꾸면 더 가독성 좋다
        // \t 띄어쓰기
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");
        // \\ 역슬래시
        System.out.println("c:\\program files\\java");
        // \\두번 써야 실제론 한 번만 표시 됨
        System.out.println("단비가\"냐옹\"이라고 했어요");
        // "를 쓰고 싶을 떈 \" \"  or \' \'
        char c = 'A';
        c='\'';
        System.out.println(c);
        // ' 하나만 쓰고 싶을 떈 ' \' ' 로 해줘야 함







    }
}
