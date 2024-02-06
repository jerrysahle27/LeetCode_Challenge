public class Solution {
    public int[] TwoSum(int[] numbers, int target) {
      for(int i =0; i < numbers.Count(); i++){
       int temp = target - numbers[i];
       if(numbers.Contains(temp) && i != Array.IndexOf(numbers, temp)){
           int[] result = new int[] { i + 1, Array.IndexOf(numbers, temp) + 1 };
           Array.Sort(result);
           return result;
        }
      }
      return new int[0];
    }
}