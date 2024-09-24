import java.util.ArrayList;

public class InheritanceDemo
{
    public static void main(String[] args)
    {
     ArrayList<Worker> workers = new ArrayList<>();
     workers.add(new Worker("Tom", "Mato", "000001","Mr.",1990,20.00));
     workers.add(new Worker("Bob","Green","000002","Mr.",1995,19.00));
     workers.add(new Worker("Jane","Violet","000003","Mrs.",1997,23.00));
     workers.add(new SalaryWorker("Greg","Zimmer","000004","Mr.",2000,25.00,75000));
     workers.add(new SalaryWorker("Jake","Brown","000005","Mr.",1993,30.00,95000));
     workers.add(new SalaryWorker("Josh","Steel","000006","Mr.",1994,26.00,85000));


        int[] hours = {40, 50, 40};
     for (int week = 1; week <= 3; week++)
     {
         System.out.println("Week " + week + " Pay:");
         for (Worker worker : workers)
         {
             double hoursWorked = hours[week - 1];
             System.out.println(worker.formalName() + ": " + worker.displayWeeklyPay(hoursWorked));
         }
     }
    }
}
