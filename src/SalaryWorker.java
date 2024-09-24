public class SalaryWorker extends Worker
{
    private double annualSalary = 1;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate, double annualSalary)
    {
        super(firstName, lastName, ID, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return annualSalary/52;
    }
   @Override
    public String displayWeeklyPay(double hoursWorked)
    {
        double weeklyPay = calculateWeeklyPay(hoursWorked);
        return "The weekly pay is:" + weeklyPay;
    }

}

