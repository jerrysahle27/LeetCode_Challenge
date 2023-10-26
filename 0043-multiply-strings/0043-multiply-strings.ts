function multiply(num1: string, num2: string): string {
    let number1 = BigInt(num1)
    let number2 = BigInt(num2)
    let result = number1 * number2
    return result.toString()
};