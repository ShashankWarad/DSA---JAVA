import java.util.*;
public class Solution {

    public static List<String> findSubstrings(String s) {
      List<String> ans = new ArrayList<>();
      Set<String> anss = new TreeSet<>();

      String op = "";

      subs(anss, s, op);
      
      for(String it : anss){
        if(it == "") continue;
        ans.add(it);
      }

      return ans;
    }

    public static void subs(Set<String> ans, String ip, String op){
      if(ip.isEmpty()){
        ans.add(op);
        return;
      }

      String op1 = op;
      String op2 = op + ip.charAt(0);

      ip = ip.substring(1);

      subs(ans, ip, op1);
      subs(ans, ip, op2);
    }
}
