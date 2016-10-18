package ch01;

import org.junit.Test;

public class TestCh01_3 {
    @Test
    public void test() {
        String str ="asdfasdfasdfsadf";
        String result = "";
        int checker = 0;
        char[] arrChr = str.toCharArray();

        for (int i = 0; i < arrChr.length; i++) {
            int val = arrChr[i];
            if((checker & (1 << val)) == 0) {
                result += String.valueOf(arrChr[i]);
                System.out.println("str : " + result);
                System.out.println(arrChr[i]);

                checker |= (1 << val);
            }
        }
    }
}
