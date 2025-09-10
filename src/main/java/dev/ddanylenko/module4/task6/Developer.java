package dev.ddanylenko.module4.task6;

public class Developer extends Employee {
    private String name;
    private int WorkExperience;
    private static final double DEFAULT_SALARY = 800;
    public Developer(String name, int WorkExperience, double koef) {
        super(koef);
        this.name = name;
        this.WorkExperience = WorkExperience;
    }

    @Override
    public double calcSalary() {
        if(this.WorkExperience < 2){
            return DEFAULT_SALARY * getSalaryKoef();
        }
        if(this.WorkExperience < 5){
            return DEFAULT_SALARY * getSalaryKoef() * 2;
        }
        return DEFAULT_SALARY * getSalaryKoef() * 4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkExperience() {
        return WorkExperience;
    }

    public void setWorkExperience(int workExperience) {
        WorkExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", WorkExperience=" + WorkExperience +  '\'' +
                ", salary= " + calcSalary() + "$ " +
                '}';
    }

}
