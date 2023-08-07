function filter(arr: number[], fn: (n: number, i: number) => any): number[] {
    let result = []
    for (let j = 0; j < arr.length; j++) {
        let newValue = fn(arr[j], j);
        if (newValue == true) {
            result.push(arr[j])
        } else if (typeof newValue === "number" && newValue !== 0) {
            result.push(arr[j])
        }
    }
    return result
};