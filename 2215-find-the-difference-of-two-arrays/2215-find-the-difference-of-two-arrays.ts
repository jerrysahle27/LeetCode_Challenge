function findDifference(nums1: number[], nums2: number[]): number[][] {
    let subarray1 = []
    let subarray2 = []
    let finalarray = []
    let i = 0
    let j = 0
    do {
        let bool = nums2.includes(nums1[i]) || subarray1.includes(nums1[i])
        if (bool === false)
            subarray1.push(nums1[i])
        i++;
    } while (i < nums1.length)
    finalarray.push(subarray1)
    do {
        let bool = nums1.includes(nums2[j]) || subarray2.includes(nums2[j])
        if (bool === false)
            subarray2.push(nums2[j])
        j++;
    } while (j < nums2.length)
    finalarray.push(subarray2)
    return finalarray
};