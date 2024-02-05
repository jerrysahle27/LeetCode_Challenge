public class Solution {
    public string ReverseWords(string s) {  
        var result = "";
        string[] sList = s.Split(new string[] { " " }, StringSplitOptions.RemoveEmptyEntries);
        for(int i = sList.Count() - 1; i >= 0 ; i--){
            if(result != "")
             result+= " ";
            result += sList[i];
        }
       return result;  
    }
}