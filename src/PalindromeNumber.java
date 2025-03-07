
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if(x<0)
            return false;
        int rev = 0,rem = 0,temp=x;
        while (x > 0) {
            rem = x % 10;
            x = x / 10;
            rev = (rev*10) + rem;
        }
        return rev == temp;
    }

        public static void main (String[]args){
            System.out.println(isPalindrome(1221));
        }
    }
