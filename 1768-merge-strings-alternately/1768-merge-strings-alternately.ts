function mergeAlternately(word1: string, word2: string): string {
    let result: string = ""
    let i = 0;
    for (const x of word1) {
        result += x
        word2[i] ? result += word2[i] : result
        i++;
    }
    if (word2.length > word1.length)
        result += word2.substr(word1.length, word2.length - 1)
    return result
};