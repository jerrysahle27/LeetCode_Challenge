function map(arr: number[], fn: (n: number, i: number) => number): number[] {
    let result = []
    for (let j = 0; j < arr.length; j++) {
        let newValue = fn(arr[j], j);
        result.push(newValue)
    }
    return result
};