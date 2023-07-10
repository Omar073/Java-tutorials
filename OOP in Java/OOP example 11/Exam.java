import java.util.Arrays;

class Exam{

    String Course_code;
    TimeSlot timeslot;
    String[] examhalls;
    int numberofstudents;
    static int Crowded_exams=0;

    //constructor
    Exam(String Course_code, TimeSlot timeslot, String[] examhalls, int numberofstudents){
        this.Course_code = Course_code;
        this.timeslot = timeslot;
        this.examhalls = examhalls;
        this.numberofstudents = numberofstudents;
    }

    //display
    void display(){
        System.out.println("Course Code: " + Course_code + ", Time Slot: " +
        timeslot.getDay() + " / " + timeslot.getMonth() + ", slot number: " + timeslot.getSlotNumber() +
        ", Exam Halls: " + Arrays.toString(examhalls) + ", Number of Students: " + numberofstudents );
    }

    public boolean isTooCrowded(){
        if(numberofstudents / (examhalls.length) > 50){
            Crowded_exams++;
            return true;
        }
        else return false;
    }

    private boolean hasConflictWith(Exam e){
        if (!this.Course_code.equals(e.Course_code) && this.timeslot.getDay() == e.timeslot.getDay()
                && this.timeslot.getMonth() == e.timeslot.getMonth()) {
            for (String hall : examhalls) {
                for (String halle : e.examhalls) {
                    if (hall.equals(halle)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int countConflicts(Exam[] es){

        int countConflicts=0;

        for(int i = 0; i<es.length; i++){
            for(int j = i+1; j<es.length; j++){
                if(es[i].hasConflictWith(es[j])){
                    countConflicts++;
                    System.out.println("\n" + es[i].Course_code + " has conflict with " + es[j].Course_code);
                }
            }

        }

        return countConflicts;
    }
}