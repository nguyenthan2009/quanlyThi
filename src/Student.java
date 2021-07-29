public class Student {
    private String name;
    private Grade grade;
    private String identificationNumber;
    private String address;
    private String priorityArea;

    public Student(String name, Grade grade, String identificationNumber, String address, String priorityArea) {
        this.name = name;
        this.grade = grade;
        this.identificationNumber = identificationNumber;
        this.address = address;
        this.priorityArea = priorityArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriorityArea() {
        return priorityArea;
    }

    public void setPriorityArea(String priorityArea) {
        this.priorityArea = priorityArea;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", address='" + address + '\'' +
                ", priorityArea='" + priorityArea + '\'' +
                '}';
    }
}
