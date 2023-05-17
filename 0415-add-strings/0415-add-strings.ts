function addStrings(num1: string, num2: string): string {
   let number1 =  BigInt(num1)
   let number2 = BigInt(num2)
   let sum = number1 + number2
   return sum.toString();
};