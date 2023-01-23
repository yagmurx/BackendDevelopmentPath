package Classes.Pr03;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    float tax() {
        if(this.salary < 1000)
            return 0;
        else
            return (this.salary*0.03F);
    }

    int bonus() {
        if(this.workHours > 40)
            return (this.workHours-40)*30;
        else
            return 0;
    }

    float raiseSalary() {
        if(2021-this.hireYear < 10)
            return this.salary*0.05F;
        else if ((2021-this.hireYear) >= 10 && (2021-this.hireYear) < 20)
            return this.salary*0.1F;
        else
            return this.salary*0.15F;
    }

    void printEmployee() {
        System.out.println("Name\t: " + this.name);
        System.out.println("Salary\t: " + this.salary);
        System.out.println("Work Hours\t: " + this.workHours);
        System.out.println("Start Year\t: " + this.hireYear);
        System.out.println("Tax \t:" + this.tax());
        System.out.println("Bonus\t: " + this.bonus());
        System.out.println("Salary Raise\t: " + this.raiseSalary());
        System.out.println("Total Salary\t: " + (this.salary-this.tax()+this.bonus()));
        System.out.println("Salary (with raise)\t: " + (this.salary + this.raiseSalary()));
    }
}
