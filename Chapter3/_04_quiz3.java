package Chap3;

public class _04_quiz3 {
    public static void main(String[] args) {
//        String year ="1994";
//        String month = "11";
//        String day = "12";
//        String male = "1";
//        String malee = "3";
//        String female = "2";
//        String femalee = "4";
//
//        System.out.println(year.substring(2));
//        System.out.println(monthday);
        String id = "941112-12345678";
        System.out.println(id.substring(0,8)); // 0부터 8번쨰 자리 까지
        id = "1234567-89101112"; // 이거 없애면 위에꺼 String id로 바뀜
        System.out.println(id.substring(0, id.indexOf("-")+2)); // 0부터 -까지 +2







    }
}
