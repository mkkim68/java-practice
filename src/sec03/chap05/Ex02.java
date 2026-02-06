package sec03.chap05;

public class Ex02 {
    static void main(String[] args) {

        String hl1 = "Hello";
        String hl2 = "Hello";
        String wld = "World";

        // 리터럴끼리는 == 을 사용하여 비교 가능
        boolean bool1 = hl1 == hl2;
        boolean bool2 = hl1 == wld;

        String hl3 = new String("Hello");
        String hl4 = new String("Hello");
        String hl5 = hl4;

        boolean bool3 = hl3 == hl4;

        boolean bool4 = hl1.equals(hl2);
        boolean bool5 = hl3.equals(hl4);

        boolean bool6 = hl4 == hl5;

        int hl1hash = System.identityHashCode(hl1);
        int hl2hash = System.identityHashCode(hl2);
        int hl3hash = System.identityHashCode(hl3);
        int hl4hash = System.identityHashCode(hl4);
        int hl5hash = System.identityHashCode(hl5);
    }
}
