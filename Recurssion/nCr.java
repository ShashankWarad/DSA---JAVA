public class Solution {
   public static int nCr(int n, int r) {
        if(r > n) return 0;
        if(n == r || r == 0) return 1;
        return (int)(fact(n)/(fact(r)*fact(n-r)));
    }

    private static long fact(int n){
      if(n <= 1) return 1;
      return (int)n*fact(n-1);
    }
}
