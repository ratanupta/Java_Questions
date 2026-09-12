package Strings;

public class ValidPalinDrome {
    public static void main(String[] args) {
        ValidPalinDrome validPalinDrome = new ValidPalinDrome();
        String s = "A man, a plan, A Canal: Panama";
        boolean result = validPalinDrome.isPalindrome(s);
        System.out.println(result); // Output: true
    }

    public boolean isPalindrome(String s){

        int l = 0 ;
        int r = s.length() - 1;

        while(l < r){
            while(l < r  && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
