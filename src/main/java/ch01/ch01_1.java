package ch01;

public class ch01_1 {
    public static void main(String[] args) {
        String str = args[0];
        int check = 0;

        for(char c : str.toCharArray()) {
            System.out.println("c : " + c);
            if((check & (1 << c)) > 0) {
                System.out.println("false");
                break;
            } else {
                check |= 1<<c;
                System.out.println("check : " + Integer.toBinaryString(check));
            }
        }
    }
}
