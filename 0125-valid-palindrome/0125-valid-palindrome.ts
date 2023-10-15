function isPalindrome(s: string): boolean {
    let reversedString = ""
    s = s.replace(/[^a-zA-Z0-9]/g, "");
    for (let i = s.length - 1; i >= 0; i--) {
        reversedString += s[i]
    }
    if (reversedString.toLowerCase() === s.toLowerCase()) return true
    else return false
};