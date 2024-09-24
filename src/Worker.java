public class Worker extends Person
{
    private double hourlyPayRate = 1;


    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate)
    {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }
   public double calculateWeeklyPay(double hoursWorked)
   {
       double totalPay;
       if (hoursWorked > 40) {
           double overtimePay = hoursWorked - 40;
           totalPay = (hourlyPayRate * 40) + (hourlyPayRate * 1.5 * overtimePay);
       } else {
           totalPay = hourlyPayRate * hoursWorked;
       }
       return totalPay;
   }

   public String displayWeeklyPay(double hoursWorked)
   {
       double regularPay = hoursWorked * hourlyPayRate;
       double overtimePay = hoursWorked - 40 * hourlyPayRate * 1.5;
       double totalPay = regularPay + overtimePay;

       return "The regular pay (40 hours) is: " + regularPay + "The overtime pay is: "
               + overtimePay + "The total pay is: " + totalPay;
    }

    @Override
    public String toString()
    {
        return "Worker{" +
            super.toString() +
            " hourlyPayRate=" + hourlyPayRate +
            "}";
    }

    @Override
    public String toCSVDataRecord() {
        return super.toCSVDataRecord();
    }

    @Override
    public String toJSON() {
        return super.toJSON();
    }

    @Override
    public String toXML() {
        return super.toXML();
    }
}

