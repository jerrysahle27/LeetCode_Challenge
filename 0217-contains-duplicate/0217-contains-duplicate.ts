function containsDuplicate(nums: number[]): boolean {
    const numbers = [...new Set(nums)]
    if (numbers.length === nums.length)
        return false
    else return true
};