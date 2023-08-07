type Fn = (accum: number, curr: number) => number

function reduce(nums: number[], fn: Fn, init: number): number {
    init == null ?  init = 0 : init = init
    for (let i = 0; i < nums.length; i++) {
        let temp = fn(init, nums[i])
        init = temp;
    }
    return init
};