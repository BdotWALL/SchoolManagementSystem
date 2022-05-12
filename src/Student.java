/** 
 * This class is responsible for keeping track
 * of students name, fees, grade and ID.
*/

public class Student {
   private  int id;
   private String name;
   private int grade;
   private int feesPaid;
   private int feesTotal;

//Constructor   
   public Student(int id, String name, int grade) {
       this.name =name;
       this.grade = grade;
       this.id = id;
       this.feesPaid = 0;
       this.feesTotal = 50000;
   }

//Allows student's grade to be updated   
   public void setGrade(int grade) {
       this.grade = grade;
   }

   public void payingFees(int fees) {
       feesPaid += fees;
       School.setTotalMoneyEarned(feesPaid);

   }

   public int getRemainingFees(){
    return feesTotal-feesPaid;
   }

   public int getId() {
    return id;
}

public String getName() {
    return name;
}

public int getGrade() {
    return grade;
}


public int getFeesPaid() {
    return feesPaid;
}


public int getFeesTotal() {
    return feesTotal;
}

@Override
    public String toString() {
        return "Student's name :" + name + " Total fees paid so far $" + feesPaid;
    }
    
}
