function findMedianSortedArrays(nums1: number[], nums2: number[]): number {
    let array: number[] = nums1.concat(nums2)
    let sortedArray: number[] = array.sort(function (a, b) { return a - b })
    if (sortedArray.length % 2 == 0) {
        let indexone: number = sortedArray.length / 2
        let indextwo: number = indexone - 1
        let median = (sortedArray[indexone] + sortedArray[indextwo]) / 2
        return median
    }
    else {
        let medianIndex = sortedArray.length / 2
        // parseInt(medianIndex)
        return sortedArray[~~medianIndex]
    }
};