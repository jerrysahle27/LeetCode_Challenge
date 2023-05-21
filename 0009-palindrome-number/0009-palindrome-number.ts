function isPalindrome(x: number): boolean {
    let stringx = x.toString();
    let i = stringx.length - 1
    let reversedString = ""
    while (i >= 0) {
        reversedString += stringx[i]
        i--
    }
    console.log(reversedString)
    if (stringx === reversedString) {
        return true
    }
    else {
        return false
    }
};