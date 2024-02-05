public class Solution {
    public bool IsSubsequence(string s, string t) {
        int count =0;
        if(s == "")
         return true;
        for(var i = 0; i < s.Count();  i++){
           if(t.Contains(s[i])){
               t = t.Substring(t.IndexOf(s[i]) +1);
               Console.WriteLine(t);
               count++;
               if(count == s.Count()){
                   return true;;
               }
           }
        }
        return false;
    }
}