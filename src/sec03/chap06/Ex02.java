package sec03.chap06;

public class Ex02 {
    static void main(String[] args) {

        String str1 = "";
        String str2 = " \t\n";

        int int1 = str1.length();
        int int2 = str2.length();

        boolean bool1 = str1.isEmpty();
        boolean bool2 = str2.isEmpty();

        boolean bool3 = str1.isBlank();
        boolean bool4 = str2.isBlank();

        String str3 = "\t abc \n";
        str3 = str3.trim();
    }
}
