function searchInsert(nums: number[], target: number): number {
    const found = nums.find(n => n === target)
    if (found) {
        return nums.indexOf(found)
    } else {
        nums.push(target)
        nums.sort(function (a, b) {
            return a - b
        })
        let foundNumber = nums.find(n => n === target)
        if(foundNumber !== null){
            return nums.indexOf(foundNumber);
        }
    }
};