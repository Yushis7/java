package Chap1;

public class _05_variableNaming {
    public static void main(String[] args) {
        /*변수 이름 짓는 법
        1.저장할 값에 어울리는 이름
        2.밑줄(_),문자(abc),숫자(123)사용 가능(공백 사용 불가)
        3.밑줄 또는 문자로 시작 가능
        4.한 단어 또는 2개 이상 단어 연속
        5.소문자로 시작 ,각 단어의 시작 글자는 대문자(첫 단어는 제외)
        6.예약어 불가(public,static,void,int,double,float,...)

         */
        //입국 신고서
        String nationality = "대한민국"; // 국적
        String firstName = "Jun"; // 이름
        String lastName = "신";// 성
        String dateOfBirth = "2024-01-08"; //생년월일
        String residentialAddress = "호텔이름";// 체류장소
        String purposeOfVisit = "관광";// 입국목적
        String flightNo = "KE4885"; // 항공 편명
        String _FlightNo = "KE4885"; // 밑줄 시작
        String Flight_no_2 = "KE4885"; // 밑줄과 숫자 포함
        //String -flightNo = "KE4885";

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류기간

        String item1 = "시계";
        String item2 = "가방";

    }
}

        