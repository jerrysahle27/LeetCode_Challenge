function divide(dividend: number, divisor: number): number {
    if (dividend > 0 && divisor > 0 && dividend < divisor) {
        return 0;
    }
    else {
        let result = parseFloat(dividend.toString()) / parseFloat(divisor.toString())
        console.log(Math.trunc(result))
        result = Math.trunc(result)
        if (result > (2 ** 31) - 1) {
            return (2 ** 31) - 1
        }
        else if (result < -(2 ** 31)) {
            return -(2 ** 31)
        }
        else {
            return result
        }
    }
};