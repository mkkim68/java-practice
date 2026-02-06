package sec03.chap05;

public class Ex03 {
    static void main(String[] args) {
        boolean b1 = "안녕".equals("안녕");

        String s1 = "Hello, ";
        String s2 = "World!";

        String s3 = s1 + s2;

        String c1 = "안녕. ";
        c1 += "친구들 ";

        String c2 = c1 += "나는 바보야.";



    }
}
