function calculateSalary() {
    let empName = document.getElementById("empName").value;
    let basicSalary = Number(document.getElementById("basicSalary").value);
    let workingDays = Number(document.getElementById("workingDays").value);
    let bonus = Number(document.getElementById("bonus").value);

    let totalDays = 30;
    let grossSalary, tax, netSalary;

    function calculateGrossSalary() {
        let perDaySalary = basicSalary / totalDays;
        let earnedSalary = perDaySalary * workingDays;
        return earnedSalary + bonus;
    }

    function calculateTax(grossSalary) {
        if (grossSalary <= 25000) {
            return grossSalary * 0.05;
        } else {
            return grossSalary * 0.10;
        }
    }

    function calculateNetSalary(grossSalary, tax) {
        return grossSalary - tax;
    }

    grossSalary = calculateGrossSalary();
    tax = calculateTax(grossSalary);
    netSalary = calculateNetSalary(grossSalary, tax);

    document.getElementById("result").innerHTML =
        "Employee Name: " + empName + "<br>" +
        "Gross Salary: ₹" + grossSalary + "<br>" +
        "Tax: ₹" + tax + "<br>" +
        "Net Salary: ₹" + netSalary;
}