package sec04.chap05;

public class Ex05 {
    static void main(String[] args) {


    }

    //  💡 ... 연산자 : 해당 위치 뒤로 오는 연산자들을 배열로 묶음
    //  int[] (배열 자체를 받음)과는 다름!
    static double getAverage(int... nums) {
        double result = 0.0;
        for (int num : nums) {
            result += num;
        }
        return result / nums.length;
    }
}
