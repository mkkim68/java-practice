package sec03.chap05;

public class Ex04 {
    static void main(String[] args) {
        String str1 = String.valueOf(true);

        String str2 = true + "";

        String str123 = "123";

        byte bytNum = Byte.parseByte(str123);
        short srtNum = Short.parseShort(str123);
        int intNum = Integer.parseInt(str123);
        long lngNum = Long.parseLong(str123);

        boolean b1 = Boolean.parseBoolean("TRUE");
        boolean b2 = Boolean.parseBoolean("true");
        boolean b3 = Boolean.parseBoolean("T");

        byte bNum = Byte.parseByte("12345");
        int iNum = Integer.parseInt("123.45");
        double dNum = Double.parseDouble("하나");
    }
}
