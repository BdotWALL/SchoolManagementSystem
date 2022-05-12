import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {
        List<Teacher> teacherList = new ArrayList<>();

        Teacher peters = new Teacher(1,"L. Peters",500);
        Teacher mcDaniel = new Teacher(2,"M. McDaniel",700);
        Teacher vanderhorn = new Teacher(3,"A. Vanderhorn",600);

        teacherList.add(peters);
        teacherList.add(mcDaniel);
        teacherList.add(vanderhorn);

        List<Student> studentList = new ArrayList<>();

        Student alex = new Student(1,"Alex",4);
        Student mark = new Student(2,"Mark",12);
        Student carla = new Student(3,"Carla",8);

        studentList.add(alex);
        studentList.add(mark);
        studentList.add(carla);


        School wallHigh = new School(teacherList, studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        wallHigh.addTeacher(megan);

        alex.payingFees(5000);
        mark.payingFees(6000);

        System.out.println("Wall High has earned $" + wallHigh.getTotalMoneyEarned());


        System.out.println("------Making SCHOOL PAY SALARY----");

        peters.salaryPay(peters.getSalary());
        System.out.println("Wall High has spent $" + peters.getSalary() + " for salary to " + peters.getName()
        +" and now has $" + wallHigh.getTotalMoneyEarned());

        vanderhorn.salaryPay(vanderhorn.getSalary());
        System.out.println("Wall High has spent $" + vanderhorn.getSalary() + " for salary to " + vanderhorn.getName()
                +" and now has $" + wallHigh.getTotalMoneyEarned());


        System.out.println(carla);

        mcDaniel.salaryPay(mcDaniel.getSalary());

        System.out.println(mcDaniel);


    }
}
