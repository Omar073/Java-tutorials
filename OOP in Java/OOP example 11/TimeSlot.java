class TimeSlot{

    private int day;
    private int month;
    private int slotnumber;

    //constructor
    TimeSlot(int day, int month, int slotnumber){
        this.day = day;
        this.month = month;
        this.slotnumber = slotnumber;
    }

    //getters
    int getDay(){
        return day;
    }
    int getMonth(){
        return month;
    }
    int getSlotNumber(){
        return slotnumber;
    }

    //display
    void display(){
        System.out.println("Day: " + day + " Month: " + month + " Slot Number: " + slotnumber);
    }
}