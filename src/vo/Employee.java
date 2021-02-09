package vo;

import java.util.List;

public class Employee {
    public static int serial = 0;
    private String eid;
    private String name;
    private int salary;
    private List<String> licesne;

    public Employee() {
    }

    public Employee(String name, int salary, List<String> licesne) {
        serial++;
        this.eid = serial + "";
        this.name = name;
        this.salary = salary;
        this.licesne = licesne;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<String> getLicesne() {
        return licesne;
    }

    public void setLicesne(List<String> licesne) {
        this.licesne = licesne;
    }

    @Override
    public String toString() {
        String temp = "";

        if(licesne.size() != 0){
            for(String s : licesne){
                temp += "," + s;
            }
        }

        return eid + "," + name + "," + salary + temp;
    }
}
