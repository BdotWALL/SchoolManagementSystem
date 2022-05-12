public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name,  int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.salaryEarned = 0;
    }


    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getSalary(){
        return  salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public void salaryPay (int salary){
        salaryEarned+=salary;
        School.setTotalMoneySpent(salary);
    }


    @Override
    public String toString() {
        return "Name of the Teacher: " + name +" Total salary earned so far $" + salaryEarned;
    }






    
}
