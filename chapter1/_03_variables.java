package Chap1;

public class _03_variables {
    public static void main(String[] args) {
//        String name;
//        name = "Jun";
        String name = "Jun";
        int hour = 15;

        System.out.println(name+"님 배송이 시작되었습니다 "+hour+"시에 도착예정입니다 ");
        System.out.println(name+"님 배송 완료됏습니다");

        double score = 90.5;
        char grade = 'A';
        System.out.println(name+"님의 평균점수는 "+score+"입니다. ");
        System.out.println("학점은 "+grade+"입니다 ");

        boolean pass = false;
        System.out.println("이번 시험 패스여부?" +pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        long l = 100000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
