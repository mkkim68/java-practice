package sec03.chap06;

public class Ex05 {
    static void main(String[] args) {
        String str_a1 = "ABC";
        String str_a2 = "ABCDE";
        String str_a3 = "ABCDEFG";

        int int_a1 = str_a1.compareTo(str_a1);

        int int_a2 = str_a1.compareTo(str_a2);
        int int_a3 = str_a2.compareTo(str_a1);

        String str_a4 = "HIJKLMN";

        int int_a4 = str_a1.compareTo(str_a4);
        int int_a5 = str_a4.compareTo(str_a1);

        String str_b1 = "abc";
        String str_b2 = "DEF";

        int int_b1 = str_b1.compareTo(str_b2);
        int int_b2 = str_b1.compareToIgnoreCase(str_b2);
    }
}
