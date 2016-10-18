package ch01;

public class ch01_3 {
    public static void main(String[] args) {
        String str = args[0];
        String result = "";
        int checker = 0;
        char[] arrChr = str.toCharArray();

        for (char val : arrChr) {
            if ((checker & (1 << val)) == 0) {
                result += String.valueOf(val);
                checker |= (1 << val);
            }
        }
    }
}
