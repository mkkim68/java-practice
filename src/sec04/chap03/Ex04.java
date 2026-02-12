package sec04.chap03;

public class Ex04 {
    static void main(String[] args) {
        String[][] quotesInLangs = {
                {
                        "I am vengeance.",
                        "I am night.",
                        "I am Batman.",
                },
                {
                        "나는 복수를 하지.",
                        "나는 밤이지.",
                        "나는 배트맨이지.",
                },
        };

        String result = "";
        for (String[] quotes : quotesInLangs) {
            for (String quote : quotes) {
                result += quote + " "; // 🔴
            }
            result = result.trim().concat("\n");
        }

        System.out.println(result);
    }
}
