class Contractor extends Employee{

    private int workinghours;

    //constructor
    Contractor(String empname, int payPerhour, int workinghours){
        super(empname, payPerhour); // we give these parameters to the constructor of the employee class
        this.workinghours=workinghours;
    }

    //this overrides the original function
    @Override
    int Calc_salary(){
        return (payPerhour*workinghours);
    }
}