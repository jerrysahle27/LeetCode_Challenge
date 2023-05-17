function kthFactor(n: number, k: number): number {
    let i = 1
    let Factor = []
    do {
        if (n % i === 0) {
            Factor.push(i)
        }
        i++;
    } while (i <= n)
    console.log(Factor)
    if (Factor[k-1] !== undefined)
        return Factor[k-1]
    else
        return -1
};