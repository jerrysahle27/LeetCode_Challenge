function thirdMax(nums: number[]): number {
    nums.sort(function (a, b) {
        return b - a
    })
    let destinctNums = new Set([...nums])
    let result = [...destinctNums]
    console.log(result)
    if (result[2] !== undefined)
        return result[2]
    else return result[0]
};