public class Solution
{ 
    public static boolean isPalindrome(String str)
    {
      int i = 0, j = str.length() - 1;
      return check(i,j,str);
    }

    public static boolean check(int i, int j, String str){
      if(i >= j) return true;

      if(str.charAt(i) != str.charAt(j)) return false;

      return check(i+1, j-1, str);
    }
}
