abstract class Employee{

    String empname;
    int payPerhour;

    //constructor
    Employee(String empname, int payPerhour){
        this.empname=empname;
        this.payPerhour=payPerhour;
    }
    
    int Calc_salary(){
        return (payPerhour*8);
    }
}