function numberOfEmployeesWhoMetTarget(hours: number[], target: number): number {
    const employees: number[] = hours.filter((hour) => hour >= target)
    return employees.length
};