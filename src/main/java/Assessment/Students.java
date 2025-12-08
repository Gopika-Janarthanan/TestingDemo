package Assessment;

import java.util.ArrayList;
import java.util.List;

public class Students {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getDepartment() {
        return department;
    }


    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;

    void studentDetail(){
        System.out.println("Name : "+name + ", Department : "+department);
    }

    void studentType(){
        System.out.println("Student");
    }

}

class Ugstudent extends Students{
    @Override
    void studentType(){
        System.out.println("UG student");
    }
}

class Pgstudent extends Students{
    @Override
    void studentType(){
        System.out.println("PG student");
    }

}
class StudentMain{
    public static void main(String[] args) {
        Ugstudent u1 = new Ugstudent();
        Pgstudent p1 =new Pgstudent();
        Ugstudent u2 =new Ugstudent();
        Pgstudent p2=new Pgstudent();
        u1.setName("UG 1");
        u1.getName();
        u1.setDepartment("UG 1 dep");
        u1.getDepartment();

        u2.setName("UG 2");
        u2.getName();
        u2.setDepartment("UG 2 dep");
        u2.getDepartment();

        p1.setName("PG 1");
        p1.getName();
        p1.setDepartment("PG 1 dep");
        p1.getDepartment();

        p2.setName("PG 2");
        p2.getName();
        p2.setDepartment("PG 2 dep");
        p2.getDepartment();
        List<Students> studentlist = new ArrayList<>();
        studentlist.add(u1);
        studentlist.add(p1);
        studentlist.add(u2);
        studentlist.add(p2);
        for(Students s : studentlist){
            s.studentDetail();
            s.studentType();
        }
    }
}