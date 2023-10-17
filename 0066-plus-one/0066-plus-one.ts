function plusOne(digits: number[]): number[] {
  let stringfied = ""
  let result = []
  digits.map((d) => {
    stringfied += d
  })
  let one = BigInt("1")
  let value = BigInt(stringfied) + one;
  for (const x of value.toString()) {
    result.push(Number(x))
  }
  return result
};