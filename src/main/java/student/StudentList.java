package student;

import java.util.HashSet;

public class StudentList {
    private HashSet<Student> students = new HashSet<Student>();
    private static StudentList instance = null;
    private  StudentList(){}
    public static StudentList getInstance(){
        if(instance == null){
            instance = new StudentList();
        }
        return instance;
    }
    public HashSet<Student> getStudents() {
        return students;
    }

    public void setStudents(HashSet<Student> students) {
        this.students = students;
    }
}
