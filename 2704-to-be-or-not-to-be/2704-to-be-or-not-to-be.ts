type ToBeOrNotToBe = {
    toBe: (val: any) => boolean;
    notToBe: (val: any) => boolean;
};

function expect(val: any): ToBeOrNotToBe {
    function toBe(value: any): boolean {
        if (value === val) {
            return true
        } else {
            throw "Not Equal"
        }
    }
    function notToBe(value: any): boolean {
        if (value !== val) {
            return true
        } else {
            throw "Equal"
        }
    }
    return {
        toBe,
        notToBe
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */