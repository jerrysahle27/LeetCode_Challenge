function majorityElement(nums: number[]): number {
    for (let i = 0; i < nums.length; i++) {
        if (nums.filter((n) => n === nums[i]).length > nums.length / 2)
            return nums[i]
    }
};