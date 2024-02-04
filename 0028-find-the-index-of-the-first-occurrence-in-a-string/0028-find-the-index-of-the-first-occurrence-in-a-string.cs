public class Solution {
    public int StrStr(string haystack, string needle) {
        if(haystack.Contains(needle)){
        Console.WriteLine(haystack.IndexOf(needle));
        return haystack.IndexOf(needle);
        }else {
            return -1;
        }
    }
}