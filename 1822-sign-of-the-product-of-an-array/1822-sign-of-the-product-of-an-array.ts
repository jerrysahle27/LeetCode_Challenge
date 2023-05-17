function arraySign(nums: number[]): number {
    let i = 0;
    let product = 1;
    do {
        product = product * nums[i]
        i++;
    } while (i < nums.length)
    if (product > 0)
        return 1
    else if (product < 0)
        return -1
    else
        return 0
};