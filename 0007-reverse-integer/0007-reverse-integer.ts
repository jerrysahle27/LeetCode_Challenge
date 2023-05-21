function reverse(x: number): number {
    let result;
    let stringresult = ""
    let stringValue = x.toString()
    let i = stringValue.length;
    if (stringValue[0] === "-") {
        stringresult += "-"
    }
    do {
        if (parseInt(stringValue[i]) >= 0 ) {
            stringresult += stringValue[i]
        }
        i--
    } while (i >= 0)
    result = parseInt(stringresult)
    if(-(2 ** 31) >= result  || result >= (2 ** 31) - 1 )
    {
        result = 0  
    }
 
    return result
};