package ch01;

import org.junit.Test;

public class TestCh01_4 {
    @Test
    public void testIsAnagram() {
        String str ="abcdefghijhgfedcba";

        int length = str.length();
        int half = length/2;

        for(int i=0; i < half; i++) {
            String front = String.valueOf(str.charAt(i));
            String end = String.valueOf(str.charAt(length - i -1));

            if(front.equals(end)) {
                System.out.println("front : " + front +", end : " + end);
            } else {
                System.out.println("false");
                break;
            }
        }
    }
}
