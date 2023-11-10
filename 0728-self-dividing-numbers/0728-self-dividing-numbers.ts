function selfDividingNumbers(left: number, right: number): number[] {
    let result: number[] = []
    while (left <= right) {
        if (left.toString().length > 0) {
            let valid = []
            for (const x of left.toString()) {
                if (Number(left) % Number(x) === 0)
                    valid.push(true)
                else
                    valid.push(false)
            }
            if(!valid.includes(false))
              result.push(left)
        }
        else 
          result.push(left)
        left++;
    }
    return result
};