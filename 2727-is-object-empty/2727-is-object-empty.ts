function isEmpty(obj: Record<string, any> | any[]): boolean {
    console.log(obj.length)
    console.log(Object.keys(obj).length)
    if (obj.length > 0 || Object.keys(obj).length > 0) {
        return false
    }
    else {
        return true
    }
};