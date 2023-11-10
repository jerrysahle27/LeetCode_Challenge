function convertTemperature(celsius: number): number[] {
    let result = []
    let kelvin = celsius + 273.15
    let fahrenheit = celsius * 1.80 + 32.00
    result.push(kelvin)
    result.push(fahrenheit)
    return result
};