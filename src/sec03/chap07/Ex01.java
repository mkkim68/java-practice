package sec03.chap07;

public class Ex01 {
    static void main(String[] args) {
        String str1 = "%s의 둘레는 반지름 X %d X %f입니다.";

        String circle = "원";
        int two = 2;
        double PI = 3.14;

        String str2 = str1.formatted(circle, two, PI);

        String str3 = String.format(str1, circle, two, PI);

        String[] intFormats = {
                "%d",           // 1. 기본
                "%13d",         // 2. n 자리수 확보, 오른쪽 정렬
                "%013d",        // 3. 빈 자리수 0으로 채움
                "%+13d",        // 4. 양수는 앞에 + 붙임
                "%,13d",        // 5. 쉼표 사용
                "%-13d",        // 6. 자리수 확보, 왼쪽 정렬
                "+,013d"        // 7.
        };

        String[] fltFormats = {
                "%f",           // 1. 기본 (소수점 6자리, 0으로 메움)
                "%.2f",         // 2. 소수점 n자리 까지
                "%13.2f",       // 3. 정수자리 확보, 소수자리 제한
                "%,f",
                "%+013.2f",
                "%-13.2f"
        };

        String[] strFormats = {
                "%s",       // 1. 기본
                "%9s",      // 2. 자리 확보
                "%.2s",     // 3. ~글자만
                "%9.2렬"      // 5. 왼쪽 정
        };

    }
}
