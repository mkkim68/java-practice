package sec03.chap06;

public class Ex07 {
    static void main(String[] args) {
        String str1 = "a" + "b" + "c" + "d";

        String str2 = new StringBuilder("a")
                .append("b")
                .append("c")
                .append("d")
                .toString(); // "abcd" 생성됨
        // "a", "b", "c", "d", "abcd"가 생성되어 메모리 차지

        String str3 = "a"
                .concat("b")  // "ab" 생성
                .concat("c")  // "abc" 생성
                .concat("d"); // "abcd" 생성
        // "a", "b", "c", "d", "ab", "abc" "abcd"가 생성되어 메모리 차지

    }
}
