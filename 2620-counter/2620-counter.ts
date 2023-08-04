function createCounter(n: number): () => number {
    let count = 0
    let result = 0
    return function () {
        count += 1;
        count !== 1 ? result = n + count - 1 : result = n
        return result
    }
}


/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */