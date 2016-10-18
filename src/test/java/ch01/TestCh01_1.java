package ch01;

import org.junit.Test;

public class TestCh01_1 {
    @Test
    public void testIsUniqueDownCase() {
        String str ="asdfasdfasdfsadf";
        int checker = 0;

        for(int val : str.toCharArray()) {
            System.out.println(String.format("%s", Integer.toBinaryString(val)));
            System.out.println(String.format("%s", Integer.toBinaryString(checker)));

            if((checker & (1 << val)) > 0) {
                System.out.println(val);
                System.out.println("checker");
            } else {
                checker |= (1 << val);
            }
        }
    }
}
