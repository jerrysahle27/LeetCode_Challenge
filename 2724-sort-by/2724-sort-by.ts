type JSONValue = null | boolean | number | string | JSONValue[] | { [key: string]: JSONValue };
type Fn = (value: JSONValue) => number

function sortBy(arr: JSONValue[], fn: Fn): JSONValue[] {
    arr = arr.sort(function (a, b) {
        return fn(a) - fn(b)
    })
    return arr
};