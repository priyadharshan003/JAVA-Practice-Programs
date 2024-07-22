package patterns;

public class Patterns {
    public static void main(String[] args) {
        String pat = "ABCDE";

        int len = pat.length();
        for(int i = 0;i<len;i++){
            for(int j =0;j<len-i;j++){
                System.out.print(pat.charAt(j));
            }
            System.out.println();
        }
    }
}
