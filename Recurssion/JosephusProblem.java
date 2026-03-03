import java.util.*;

public class Solution
{
   public int josephus(int n, int k){
      ArrayList<Integer> arr = new ArrayList<>();
      for(int i = 1;i<=n;i++){
        arr.add(i);
      }
      return jos(arr, n,k,0);
   }

   public int jos(ArrayList<Integer> arr, int n, int k, int start){
    if(n == 1) return arr.get(0);
    start = (start+k-1)%n;
    arr.remove(start);
    return jos(arr, n-1, k, start);
   }
}

// =====================================================================================================

// MATHEMATICAL AND OPTIMAL SOLUTION -> based on mathematical formula -> [josephus(n, k) = (josephus(n-1, k) + k) % n]

//    public class Solution{
//       public int josephus(int n, int k){
//          int result = 0;

//          for(int i = 1; i <= n; i++){
//             result = (result + k) % i;
//          }

//          return result + 1;
//       }
//    }
