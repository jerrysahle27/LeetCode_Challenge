function shuffle(nums: number[], n: number): number[] {
    let firstSubset: number[] = nums.slice(0, n)
    let secondSubset: number[] = nums.slice(n, nums.length)
    let result: number[] = []
    let i: number = 0;
    for (const x of firstSubset) {
        result.push(x, secondSubset[i])
        i++;
    }
    return result
};