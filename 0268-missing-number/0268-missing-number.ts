function missingNumber(nums: number[]): number {
    let distinctNums = new Set([...nums])
    nums = [...distinctNums]
    nums.sort(function (a, b) {
        return a - b
    })
    console.log(nums)
    for (let i = 0; i <= nums.length; i++) {
        if (nums[i] !== i)
            return i
    }
};