class Doctor{

    String name;
    String workingday;
    static int countdoctors;

    // constructor
    Doctor(String name, String workingday){
        this.name = name;
        this.workingday = workingday;
        countdoctors++;
    }

}