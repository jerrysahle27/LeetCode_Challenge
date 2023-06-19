function lengthOfLastWord(s: string): number {
    const splited = s.split(" ");
    const newArr = []
    for (let item of splited) {
        if (item !== "")
            newArr.push(item)
    }
    let finalword = newArr[newArr.length - 1]
    console.log(newArr)
    return finalword.length
};