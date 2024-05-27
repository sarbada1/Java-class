package function;

public class Student {
    private int sid;
    private String name;
    private String grade;

    public Student() {

    }

    public Student(int sid, String name, String grade) {
        this.sid = sid;
        this.name = name;
        this.grade = grade;
    }

    // Read access we define getter
    public int getSid() {
        return sid;
    }

    //write access we define setter
    public void setSid(int sid){
        this.sid=sid;
    }

    public String getName(){
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getGrade(){
        return grade;
    }

    public void setGrade(String grade)
    {
        this.grade=grade;
    }

  
} 