import javax.swing.*; // 운영체제에 상관없이 자바에서 제공하는 기능을 받기
import java.awt.*; // 운영체제에 따른 화면구성 돕기
import java.awt.event.ActionEvent; // 이벤트 처리와 관련된 클래스,인터페이스와 관련
import java.awt.event.ActionListener; // 이벤트 처리와 관련된 클래스,인터페이스와 관련
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;


public class Calculator extends JFrame { //JFrame 상속(확장)
    private JTextField inputSpace;// 인스턴스 변수를 선언합니다. 이는 텍스트를 표시하고 입력하는 데 사용
    private String num = ""; //계산식의 숫자를 담음
    private String prev_operation = ""; // 숫자 기억하도록 변수 생성
    private ArrayList<String> equation = new ArrayList<String>(); // 숫자와 사칙연산 구분

    
// "=" 버튼 , 키보드 Enter , = 눌렀을때 실행되는 메서드
// private void equal() {
//     if (inputText != " ") { // 입력창에 숫자를 입력하지않고 "="을 누르는 것을 방어하는 코드
//         numbers.add(Double.parseDouble(inputText.strip()));  // inputText 는 String 타입이기에 Double로 형변환시켜 배열에저장
//     }
//     if (!opers.contains("=") && opers.size() >= 1) { // 연산자를 보관중인 배열에는 = 기호는 하나만 있어야하고, 사칙연산자중 하나는 있어야만 실행된다
//         opers.add("=");
//         totalText += inputText + opers.get(opers.size() - 1); // 연산과정을 보여주기위한 장치
//         calc.run(); // 내부클래스 calculator의 run메서드 실행
//         inputText = calc.getResult(); // calculator의 result멤버변수를 가져와서 담아라
//     }
//     mainText.setText(inputText); // 결과값 출력
//     subText.setText(totalText); // 연산과정 출력
//     lastResult = true; // 결과값을 가지고 연산할 것인지 여부파악
// }
    public Calculator() {
        setLayout(null); // 기본 레이아웃 관리자 제거

        

//        라벨
        // JLabel userNameInfo = new JLabel("계산자 : ");
        // userNameInfo.setFont(new Font("나눔고딕", Font.BOLD, 15)); // 폰트
        // userNameInfo.setBounds(10, 15, 80, 30); //위치


//        네임 입력
        // JLabel userNameInput = new JLabel("만든사람"); //데이터베이스 연결할 자리
        // userNameInput.setHorizontalAlignment(userNameInput.LEFT); // 정렬
        // userNameInput.setFont(new Font("나눔고딕", Font.BOLD, 15)); // 폰트
        // userNameInput.setBounds(85, 15, 80, 30); //위치


//        계산 창
        inputSpace = new JTextField(); // Instance
        inputSpace.setEditable(false); // 편집 불가능
        inputSpace.setBackground(Color.white); // 배경색
        inputSpace.setHorizontalAlignment(JTextField.RIGHT); // 정렬
        inputSpace.setFont(new Font("나눔고딕", Font.BOLD, 35)); // 폰트
        inputSpace.setBounds(1, 50, 280, 50); // x,y는 숫자출력되는 곳 위치 width는 가로길이,height는 세로길이


//        버튼 담을 패널
        JPanel buttonPanel = new JPanel(); // 버튼 담음
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10)); // 가로 칸수, 세로 칸수, 좌우 간격, 상하 간격 => 격자 형태 배치
        buttonPanel.setBounds(8, 115, 270, 235); // 위치

//        버튼 정보 입력
        String[] button_names = {"7", "8", "9", "÷", "4", "5", "6", "×", "1", "2", "3", "-", "C", "0", "=", "+"}; //계산기 버튼 글자 배열
        JButton[] buttons = new JButton[button_names.length]; //버튼 배열

//        버튼 생성
        for (int i = 0; i < button_names.length; i++) {
            buttons[i] = new JButton(button_names[i]);
            buttons[i].setFont(new Font("나눔고딕", Font.BOLD, 20));

            // 배열 0~3 4~7 8~11 12~15
            if (button_names[i].equals("C")) {
                buttons[i].setBackground(Color.pink);
            } else if ((i >= 0 && i <= 2) || (i >= 4 && i <= 6) || (i >= 8 && i <= 10) || i == 13) {
                buttons[i].setBackground(Color.gray);
            } else {
                buttons[i].setBackground(Color.LIGHT_GRAY);
            }
            buttons[i].setForeground(Color.WHITE); //글자색
            buttons[i].setBorderPainted(false); //테두리 없앰
            buttons[i].addActionListener(new PadActionListener()); //액션리스너 버튼에 추가
            buttonPanel.add(buttons[i]);
        }

        

        

        // 패널에 추가
        add(inputSpace);
        add(buttonPanel);
        // add(userNameInfo);
        // add(userNameInput);


//		창 제목, 창 보이기, 창 사이즈 등
        setTitle("계산기"); //제목
        setVisible(true); //프레임 보이기
        setSize(300, 400);
        setLocationRelativeTo(null); // 화면 가운데
        setResizable(false); // 사이즈 조절 불가
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫을 때 실행 중인 프로그램도 종료
    }

    

//    getActionCommand() 이벤트가 발생한 객체의 텍스트가 리턴
//    getSource() 이벤트가 발생한 객체의 해시코드가 리턴
//    getModifiers() 이벤트가 발생했을 때 같이 누른 조합키(Alt, Ctrl, Shift) 값이 리턴


    class PadActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) { // 이벤트 처리
            String operation = e.getActionCommand(); //어떤 버튼 눌렸는지 받아옴

            if (operation.equals("C")) { //만약 눌린 게 C버튼이라면 계산식 내용을 지워줌
                inputSpace.setText("");
            } else if (operation.equals("=")) { //만약 눌린 게 =이라면 입력된 식을 계산해 계산값이 나오도록 함
                String result = Double.toString(calculate(inputSpace.getText())); //계산 기능
                inputSpace.setText("" + result);
                num = "";
            } else if (operation.equals("+") || operation.equals("-") || operation.equals("÷") || operation.equals("×")) {
                if (inputSpace.getText().equals("") && operation.equals("-")) { //음수
                    inputSpace.setText(inputSpace.getText() + e.getActionCommand());
                } else if (!inputSpace.getText().equals("") && !prev_operation.equals("+") && !prev_operation.equals("-") && !prev_operation.equals("÷") && !prev_operation.equals("×")) {
                    inputSpace.setText(inputSpace.getText() + e.getActionCommand());
                }
            } else { //나머지 버튼 눌렀을 경우 계산식에 추가되도록 함
                inputSpace.setText(inputSpace.getText() + e.getActionCommand());
            }
            prev_operation = e.getActionCommand(); //마지막으로 누른 버튼 기억
        }
    }

    // 숫자 & 연산자
    private void fullTextParsing(String inputText) {
        equation.clear();

        for (int i = 0; i < inputText.length(); i++) { //계산식의 글자를 하나하나 거쳐감
            char ch = inputText.charAt(i);

            if (ch == '-' || ch == '+' || ch == '÷' || ch == '×') {
                equation.add(num);
                num = "";
                equation.add(ch + ""); //num 초기화하고, 연산 기호를 ArrayList에 추가
            } else {
                num = num + ch; //나머지 숫자의 경우 num문자에 더해줌
            }
        }
        equation.add(num);
        equation.remove("");
    }

    //    계산기능
    public double calculate(String inputText) {
        fullTextParsing(inputText);

        double prev = 0;
        double current = 0;
        String mode = ""; // 연산 기호에 대한 처리

        for (int i = 0; i < equation.size(); i++) {
            String s = equation.get(i);

         // 음수로 나오면0 문제
            if (s.equals("+")) {
                mode = "add";
            } //else if (s.equals("-")) { mode = "sub"; } // <= 이거 입력하면 마이너스로 계산이 됨
            else if (s.equals("÷")) {
                mode = "div";
            } else if (s.equals("×")) {
                mode = "mul";
            } else { //숫자 double로 형 변환
                if ((mode.equals("mul") || mode.equals("div")) && (!s.equals("+") && !s.equals("-") && !s.equals("÷") && !s.equals("×"))) {
                    Double one = Double.parseDouble(equation.get(i - 2));
                    Double two = Double.parseDouble(equation.get(i));
                    Double result = 0.0;

                    if (mode.equals("mul")) {
                        result = one * two;
                    } else if (mode.equals("div")) {
                        result = one / two;
                    }
                    equation.add(i + 1, Double.toString(result));

                    for (int j = 0; j < 3; j++) {
                        equation.remove(i - 2);
                    }
                    i -= 2; //결과값이 생긴 인덱스로 이동
                }
            }
        } //곱셈 나눗셈을 먼저 계산한다

        for (String s : equation) {
            if (s.equals("+")) {
                mode = "add";
            } else if (s.equals("-")) {
                mode = "sub";
            } else {
                current = Double.parseDouble(s);
                if (mode.equals("add")) {
                    prev += current;
                } else if (mode.equals("sub")) {
                    prev -= current;
                } else {
                    prev = current;
                }
            }
            prev = Math.round(prev * 100000) / 100000.0; //소수점 자리 제한
        }
        return prev;
    }

    public static void main(String[] args) {
        new Calculator();
    }

}
