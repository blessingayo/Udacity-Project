package UdacityProject.personTester;

public class Person {

    private String Fname;
    private String Lname;
    private String sex;

    public Person(String fname, String lname, String sex) {
        Fname = fname;
        Lname = lname;
        this.sex = sex;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        this.Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        this.Lname = lname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex() {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Fname='" + Fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

