class FullTimeEmployee extends Employee{

    private int overtime;

    //constructor
    FullTimeEmployee(String empname, int payPerhour, int overtime){
        super(empname, payPerhour);
        this.overtime=overtime;
    }

    @Override
    int Calc_salary() {
        return (payPerhour*(8+overtime));
    }
}
