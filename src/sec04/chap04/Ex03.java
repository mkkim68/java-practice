package sec04.chap04;

public class Ex03 {
    static void main(String[] args) {

        int enemies = 0;

        System.out.println("일단 사격");

        do {
            System.out.println("탕");
            if (enemies > 0) enemies--;
        } while (enemies > 0);

        System.out.println("사격중지 아군이다");

    }
}
