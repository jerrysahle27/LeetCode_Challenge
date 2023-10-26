function hammingWeight(n: number): number {
  let num = n.toString(2);
  let count = 0
  for (const s of num) {
    if (s === '1')
      count++
  }
  return count
};