package sec04.chap04;

public class Ex01 {
    static void main(String[] args) {

        int i = 0;

        //  💡 while 문의 괄호에는 종료조건만
        while (i < 10) {
            // 종료조건 충족을 위한 값 변화는 외적으로
            System.out.println(i++);
        }

    }
}
