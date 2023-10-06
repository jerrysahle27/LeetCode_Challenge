function singleNumber(nums: number[]): number {
    for (let i = 0; i < nums.length; i++) {
        const ss = nums.filter(function (f) {
            return f !== nums[i];
        });
        if (ss.length === nums.length - 1) {
            return nums[i]
        }
    }
//   return
};
