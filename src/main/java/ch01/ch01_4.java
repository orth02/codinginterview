package ch01;

public class ch01_4 {
    public static void main(String[] args) {
        String str = args[0];

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
