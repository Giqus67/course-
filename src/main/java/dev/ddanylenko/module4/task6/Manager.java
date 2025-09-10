package dev.ddanylenko.module4.task6;

public class Manager extends Employee{
    private final String name;

    private int doneProject;

    private static final double DEFAULT_SALARY = 700;

    public Manager(double salaryKoef, String name, int doneProject) {
        super(salaryKoef);
        this.name = name;
        this.doneProject = doneProject;
    }

    public String getName() {
        return name;
    }

    public int getDoneProject() {
        return doneProject;
    }

    public void setDoneProject(int doneProject) {
        this.doneProject = doneProject;
    }

    @Override
    public double calcSalary() {
        if(doneProject < 3){
            return DEFAULT_SALARY * getSalaryKoef();
        }
        if(doneProject <10){
            return DEFAULT_SALARY * getSalaryKoef() * 2;
        }
        return DEFAULT_SALARY * getSalaryKoef() * 4;
    }
    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", DoneProject=" + doneProject +  '\'' +
                ", salary= " + calcSalary() + "$ " +
                '}';
    }
}
