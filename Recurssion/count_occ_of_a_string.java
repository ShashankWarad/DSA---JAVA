public class Solution {
    public static int count(String text, String word) {
      int ans = 0;
      return counts(text, word, 0, ans);
    }

    public static int counts(String text, String word, int index, int ans){
      if(index == text.length()) return ans;
      if((text.length() - index) < word.length()) return ans;
      if(text.charAt(index) == (word.charAt(0))){
        int a = index;
        int i = 0;
        while(i<word.length()){
          if(text.charAt(a) != word.charAt(i)){
            break;
          }
          else if(text.charAt(a) == (word.charAt(i))){
            a++;
            i++;
          }
          if(i == word.length())
              ans++;
        }
      }
      return counts(text, word, index+1, ans);
    }
}


// ========================================================================================================================================================================

// OPTIMAL SOLUTION WITH indexOf function 


//     public class Solution {
//     public static int count(String text, String word) {
//         if (text == null || word == null || word.isEmpty()) return 0;

//         int count = 0;
//         int index = 0;

//         while ((index = text.indexOf(word, index)) != -1) {
//             count++;
//             index++;
//         }

//         return count;
//     }
// }
