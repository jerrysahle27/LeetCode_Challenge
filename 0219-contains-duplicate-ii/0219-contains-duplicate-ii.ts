function containsNearbyDuplicate(nums: number[], k: number): boolean {
    for (let i = 0; i < nums.length; i++) {
        if (i === nums.length - 1)
            return false
        for (let j =  i + 1; j < nums.length; j++) {
            if (nums[i] === nums[j]) {
                if (i - j < 0 && (i - j) * -1 <= k) {
                    return true
                }
                else if (i - j > 0 && i - j <= k)
                    return true
            }
        }
    }
    return false
};