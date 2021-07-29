import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public void showAll(){
        for (Student student:
             studentList) {
            System.out.println(student);
        }
    }
    public int getIndexbyIdentificationNumber(String identificationNumber){
        int index =-1;
        for (int i=0;i<studentList.size();i++){
            if(studentList.get(i).getIdentificationNumber().equals(identificationNumber)){
                index = i;
            }
        }
        return index;
    }
    public void showStudent(int index){
        System.out.println(studentList.get(index));
    }
    public void deleteStudent(int index){
        studentList.remove(index);
    }
}