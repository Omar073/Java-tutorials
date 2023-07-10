class Clinic{

    int count_doctors(Doctor[] doctor){
        return Doctor.countdoctors;
    }

    void display_doctors(Doctor[] doctors){
        System.out.println("\nthe doctor(s) working on Monday: ");
        for(int i = 0; i < doctors.length; i++){
            if(doctors[i].workingday.equals("monday")){
                System.out.println(doctors[i].name);
            }
        }
    }
}