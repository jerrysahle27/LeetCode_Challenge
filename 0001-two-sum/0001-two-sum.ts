function twoSum(nums: number[], target: number): number[] {
    const result = []
    let i = 0
    do {
        let j = 1
        do {
            if ((nums[i] + nums[j]) === target && i !== j) {
                result.push(i)
                result.push(j)
                break;
            } j++;
        } while (j <= nums.length)
        if(result.length > 0)
         break;
        i++;
    } while (i <= nums.length)
    return result
};