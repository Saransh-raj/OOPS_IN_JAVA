public class Encapsulation {
    class Customer {
        private String name;
        private int accNo;
        private String email;
        private long phNo;

        
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public int getAccNo() {
            return accNo;
        }
        public void setAccNo(int accNo) {
            this.accNo = accNo;
        }

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }

        public long getPhNo() {
            return phNo;
        }
        public void setPhNo(long phNo) {
            this.phNo = phNo;
        }
    }

    class Employee{
        private String name;
        private int Emp_id;
        private double Emp_salary;
        private String email;

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public int getEmp_id(){
            return Emp_id;
        }
        public void setEmp_id(int Emp_id){
            this.Emp_id = Emp_id;
        }

        public double getEmp_salary(){
            return Emp_salary;
        }
        public void setEmp_salary(double Emp_salary){
            this.Emp_salary = Emp_salary;
        }

        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email = email;
        }
    }

    class Branch{
        private String name;
        private String IFSC_Code;
        private String email;

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        public String getIFSC_Code(){
            return IFSC_Code;
        }
        public void setIFSC_Code(String IFSC_Code){
            this.IFSC_Code = IFSC_Code;
        }

        public String getEmail(){
            return email;
        }
        public void setEmail(String email){
            this.email = email;
        }
    }

    public static void main(String[] args) {
        Encapsulation bank = new Encapsulation(); 
        Customer c1 = bank.new Customer(); 

    
        c1.setName("Saransh");
        c1.setAccNo(12345);
        c1.setEmail("saransh@gmail.com");
        c1.setPhNo(9876543210L);

        
        System.out.println("Customer Details:");
        System.out.println("Customer Name: " + c1.getName());
        System.out.println("Account No: " + c1.getAccNo());
        System.out.println("Email: " + c1.getEmail());
        System.out.println("Phone No: " + c1.getPhNo());

        System.out.println("-------------------------------------------------------");

        //employee object
        Employee e1 = bank.new Employee();

        e1.setEmp_id(5566);
        e1.setEmail("raj@gmail.com");
        e1.setEmp_salary(25000);
        e1.setName("raj");

        System.out.println("Employee Details :- ");
        System.out.println("Employee Name : "+e1.getName());
        System.out.println("Employee ID : "+e1.getEmp_id());
        System.out.println("Employee Email id : "+e1.getEmail());
        System.out.println("Employee Salary : "+e1.getEmp_salary());

        System.out.println("-------------------------------------------------------");

        // branch object
        Branch b1 = bank.new Branch();

        b1.setName("limda");
        b1.setIFSC_Code("LIM9076");
        b1.setEmail("boblimda@gmail.com");

        System.out.println("Branch Details :- ");
        System.out.println("Branch Name : "+b1.getName());
        System.out.println("Branch IFSC code : "+b1.getIFSC_Code());
        System.out.println("Branch email : "+b1.getEmail());
    }
}