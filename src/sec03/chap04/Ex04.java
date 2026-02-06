package sec03.chap04;

public class Ex04 {
    static void main(String[] args) {

        int num1 = 3, num2 = 4;

        char num1OE = num1 % 2 == 1 ? '홀' : '짝';
        char num2OE = num2 % 2 == 1 ? '홀' : '짝';

        int num = 3;
        boolean mult2 = true;
        boolean plus5 = true;

        System.out.println(
                (!mult2 && !plus5) ? num
                        : (mult2 && plus5) ? num * 2 + 5
                        : mult2 ? num * 2
                        : num + 5
        );

        int x=1, y=2;

        int changed1 = x < y ? (x += 2) : (y += 2);
    }
}
