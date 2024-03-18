package chap5;

public class _03_multiearray {
    public static void main(String[] args) {
        //3x5 크기의 2차원 배열
        String[][] seats = new String[][]{
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };

        //B2에 접근하려면?
        System.out.println(seats[1][1]);
        //C5에 접근하려면?
        System.out.println(seats[2][4]);
        //첫 줄에는 3칸,둘쨰 줄에는 4칸,셋째 줄에는 5칸
        String[][] seats2= {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        //A3에 접근하려면?
        System.out.println(seats2[0][2]);

        System.out.println(seats2[0][4]); //a5가 없는데 찾으려 하면 오류남

//        //3차원 배열 만들기
//        String[][][][] maaray = new String[3][3][3]{
//            {{},{},{}},
//            {{},{},{}},
//            {{},{},{}},
//        };
//        System.out.println(maaray[0][1][2]);
//


    }
}

