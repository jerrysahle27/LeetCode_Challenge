type ReturnObj = {
    increment: () => number,
    decrement: () => number,
    reset: () => number,
}

function createCounter(init: number): ReturnObj {
    let result = init;
    function increment() {
        result += 1
        return result
    }
    function reset() {
        result = init
        return result
    }
    function decrement() {
        result = result - 1
        return result 
    }
    return {
        increment,
        reset,
        decrement
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */