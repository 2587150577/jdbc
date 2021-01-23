package day15;

import java.math.BigDecimal;

public class Emp {
    private  Integer id;
    private  String name;
    private  String job;
    private  String hiredate;
    private BigDecimal sal;

    public Emp() {
    }

    public Emp(Integer id,  String name, String job, String hiredate, BigDecimal sal) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.hiredate = hiredate;
        this.sal = sal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hireString) {
        this.hiredate = hireString;
    }

    public BigDecimal getSal() {
        return sal;
    }

    public void setSal(BigDecimal sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", hireString=" + hiredate +
                ", sal=" + sal +
                '}';
    }
}
