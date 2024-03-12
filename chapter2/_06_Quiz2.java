package Chap2;

public class _06_Quiz2 {
    public static void main(String[] args) {
//        int z = 120;
//        int w = 115;
//        int cm = (z <= w) ? z:w;
//        System.out.println("키가"+cm+"이므로 탑승이 불가합니다");
//
//        int v = 121;
//        int cm2 = (z > v) ? z:v;
//        System.out.println("키가"+cm2+"이므로 탑승이 가능합니다");

//        String c = ("고객님의 키를 입력해 주세요. 입력칸 ");
//        System.out.println(c); //이런 식으로 하려면 아래쪽은 int가 아니라 if문으로 바꿔야 할듯?
        int a = 121;
        String b = (a>120) ? "탑승 가능합니다" : "탑승 불가합니다";
        System.out.println("키 가"+a+"이므로"+b);
    }
}
