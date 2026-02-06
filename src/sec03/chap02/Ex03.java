package sec03.chap02;

public class Ex03 {
    static void main(String[] args) {
        float flt1 = 3.14f;
        double dbl1 = 3.14;

//        float flt2 = dbl1;
        double dbl2 = flt1;

        long lng1 = 123;
        float flt3 = lng1;
        double dbl3 = lng1;

        long lng2 = Long.MAX_VALUE;
        float flt4 = lng2;
        double dbl4 = lng2;

        float fl5 = 123.45f;
        fl5 += 6.78;
        fl5++;
        fl5++;
        fl5--;
    }
}
