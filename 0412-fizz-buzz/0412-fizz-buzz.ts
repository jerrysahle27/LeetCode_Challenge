function fizzBuzz(n: number): string[] {
    let i = 1;
    let result: string[] = []
    while (i <= n) {
        if (i % 3 === 0 && i % 5 === 0)
            result.push("FizzBuzz")
        else if (i % 3 === 0)
            result.push("Fizz")
        else if (i % 5 === 0)
            result.push("Buzz")
        else result.push(i.toString())
        i++
    }
    return result
};