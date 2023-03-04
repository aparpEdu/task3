package student;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class StudentHelper {
   private static boolean available = true;
    public static void addVotes(Student student){
        student.setVotes(student.getVotes()+1);
    }
    public static void vote(PrintWriter out,int id, String firstName,String lastName,String major){
        Student student = new Student();
        student.setId(id);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setMajor(major);
        HashSet<Student> studentHashSet = StudentList.getInstance().getStudents();

        for (Student studentCandidate: studentHashSet ){
            if(studentCandidate.getId() == id){
                addVotes(studentCandidate);
                out.println("You've successfully voted for " + studentCandidate.getId());
                setAvailable(false);
            }
        }
        if(isAvailable()){
            student.setVotes(1);
            studentHashSet.add(student);
            StudentList.getInstance().setStudents(studentHashSet);
            out.println("You've successfully voted for " + student.getId());
        }
    }
    public static void viewScoreboard(PrintWriter out){
        HashSet<Student> students;
        students = StudentList.getInstance().getStudents();
        List<Student> studentList = new ArrayList<>(students);
        studentList.sort(Comparator.comparingInt(Student::getVotes).reversed());
        for(Student student: studentList){
            out.println(student.toString());
        }

    }

    public static boolean isAvailable() {
        return available;
    }

    public static void setAvailable(boolean available) {
        StudentHelper.available = available;
    }
}
