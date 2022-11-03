package codingmock;

abstract class Employee
{
    
    public int getEmployeeid() {
        return employeeid;
    }
    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public Employee(int employeeid, String employeeName) {
        super();
        this.employeeid = employeeid;
        this.employeeName = employeeName;
    }
    protected int employeeid;
    protected String employeeName;
    protected double salary;
    
    public abstract void calculateSalary();
}
     class PermanentEmployee extends Employee
    {
        public PermanentEmployee(int employeeid, String employeeName,double basicPay) {
            super(employeeid, employeeName);
            this.basicPay=basicPay;
        }



       private double basicPay;
        
        public double getBasicPay() {
            return basicPay;
        }



       public void setBasicPay(double basicPay) {
            this.basicPay = basicPay;
        }
        public void calculateSalary()
        {
            salary =basicPay- (basicPay*0.12);
            
        }
    }
      class TemporaryEmployee extends Employee
    {
        
        public TemporaryEmployee(int employeeid, String employeeName,int hoursWorked,int hourslyWages) {
            super(employeeid, employeeName);
            this.hoursWorked=hoursWorked;
            this.hourslyWages=hourslyWages;
        }
        public int getHoursWorked() {
            return hoursWorked;
        }
        public void setHoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
        }
        public int getHourslyWages() {
            return hourslyWages;
        }
        public void setHourslyWages(int hourslyWages) {
            this.hourslyWages = hourslyWages;
        }
        private int hoursWorked;
        private int hourslyWages;
        
        public void calculateSalary()
        {
            salary=hoursWorked*hourslyWages;
        }
    }
    




class loan
{
    double loan=0.0;
    public double calculateLoanAmount(Employee empObj)
    {
        if(empObj instanceof TemporaryEmployee)
        {
            loan=empObj.getSalary()*.15;
        }
        else if(empObj instanceof PermanentEmployee)
        {
            loan=empObj.getSalary()*.1;
        }
        return loan;
        
    }
}




public class employ {



   public static void main(String[] args) {
        PermanentEmployee pe=new PermanentEmployee(100,"abhi",50000);
        pe.calculateSalary();
        System.out.print(pe.getEmployeeid()+" "+pe.getEmployeeName()+" "+pe.getSalary()+"\n");
        loan lObj=new loan();
        double m=lObj.calculateLoanAmount(pe);
        System.out.println("Loan amount for "+pe.getEmployeeName()+" : "+m);
        TemporaryEmployee te=new TemporaryEmployee(101,"abhijith",30,500);
        te.calculateSalary();
        System.out.print(te.getEmployeeid()+" "+te.getEmployeeName()+" "+te.getSalary()+"\n");
        double m1=lObj.calculateLoanAmount(te);
        System.out.println("Loan amount for "+te.getEmployeeName()+" : "+m1);
        
    }



}
