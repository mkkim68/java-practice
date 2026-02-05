package sec03.chap01;

public class Ex05 {
    static void main(String[] args) {
        int a = 1;
        a = a + 2;

        a += 3;

        int b = a += 4;

        int i1 = 0;
        int i2 = 1;
        int i3 = i1 = i2;

        String s1 = "ABC";
        String s2 = "가나다";
        String s3 = (s1 = s2);
    }
}
