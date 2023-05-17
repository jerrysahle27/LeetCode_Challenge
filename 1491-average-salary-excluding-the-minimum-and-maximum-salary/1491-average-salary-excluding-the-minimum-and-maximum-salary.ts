function average(salary: number[]): number {
 let i = 0;
    let sortedSalary = salary.sort(function (a, b) { return b - a })
    sortedSalary = sortedSalary.slice(1, sortedSalary.length - 1)
    console.log(sortedSalary)
    let average = 0
    let sum = 0
    do {


        sum = sum + sortedSalary[i]
      
        average = sum / sortedSalary.length;

        i++;
    } while (i < sortedSalary.length)
    return average
};