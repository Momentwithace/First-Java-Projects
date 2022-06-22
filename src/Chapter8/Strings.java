package Chapter8;

public class Strings {
    public static void main(String[] args) {
        String s = "abcdabcdabcdca";

        int aCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a'){
                aCount++;
            }


        }


        System.out.println("The Count of a in s is: " + aCount);
    }


    public static int count(String s, char c){
        String s2 = "abcdabcdabcdca";
        char[] charArray = s.toCharArray();
        int aCount = 0;

        int countOfA = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a'){
                aCount++;
            }


        }
        return aCount;

    }



}



