// 19- Quiz 2

// Write a Java class TimeSlot representing an exam timing. The class should only 
// encapsulate the day (int), month (int), and slot number (int). Then write a Java 
// class Exam representing an exam’s information. The class should encapsulate the 
// following fields: a course code (String), a time slot (TimeSlot), an array of 
// exam halls (String[]), and the total number of students registered in the course 
// (int). Both classes should have appropriate constructors and printing methods. 
// Additionally, the TimeSlot class should have an accessor method for each of its 
// fields. The Exam class should also provide the following methods : 

//  isTooCrowded(): a public method returning a boolean value assessing 
// whether the halls of the current exam object are too crowded. Assume that 
// students are equally distributed on all assigned halls and that a hall is considered 
// too crowded for an exam if it has more than 50 students. 

//  hasConflictWith(Exam e): a private method returning a boolean value 
// indicating whether the current exam object has a conflict with the passed exam e. 
// Two exams are in conflict if they have different course codes, are held in the same 
// time, and have at least a hall in common. 

//  countConflicts(Exam[] es): a public static method returning the number 
// of conflicts existing in an exam timetable given by an array of exams. Note that if 
// two exams are in conflict with each other, their conflict should be counted once. 
// This method should use the hasConflictWith method you just defined. 

// Write a program making use of all the public functionality provided by the Exam
// class on an array of 3 exams initialized with values of your choice. Use the method 
// java.util.Arrays.sort() to sort this array based on the total number of 
// registered students in the course that in each exam slot.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {

        Exam[] exams = new Exam[3];
        
        exams[0] = new Exam("CSE112", new TimeSlot(24, 12, 5), new String[]{"Hall A", "HAll B"}, 260);
        exams[1] = new Exam("PHM111", new TimeSlot(15, 4, 3), new String[]{"Hall A", "HAll B"}, 80);
        exams[2] = new Exam("CSE321", new TimeSlot(24, 12, 5), new String[]{"Hall A", "HAll C", "Hall D"}, 200);

        // Display all exams
        System.out.println("All exams: ");
        for (Exam exam : exams) {
            exam.display();
        }

        // Display the number of conflicts
        System.out.println("Number of conflicts: " + Exam.countConflicts(exams));

        //check if the exam is too crowded
        for (Exam exam : exams) {
            if(exam.isTooCrowded()){
                System.out.println(exam.Course_code + " is too crowded");
            }
        }

        // Display the number of crowded exams
        System.out.println("Number of crowded exams: " + Exam.Crowded_exams);


        // Sort the array of Exam objects based on the number of registered students in each course
        Arrays.sort(exams, (e1, e2) -> e1.numberofstudents - e2.numberofstudents);

        // Print out the sorted array of Exam objects
        System.out.println("\nAll exams after sorting: ");
        for (Exam exam : exams) {
            exam.display();
        }

    }
}




