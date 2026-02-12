package sec04.chap03;

public class Ex05 {
    static void main(String[] args) {
        
        for (int i = 0; i < 100; i++) {

            //  💡 continue : 한 루프만 건너뜀
            if (i % 3 == 0) continue;

            //  💡 break : 블록 전체를 종료
            if (i == 10) break;

            System.out.println(i);
        }

    }
}
