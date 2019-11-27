package com.astha.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String cname;

    @OneToMany(mappedBy = "cour",cascade = CascadeType.ALL)
    private List<faculty> faculty = new ArrayList<>();


    public List<com.astha.bean.faculty> getFaculty() {
        return faculty;
    }

    public void setFaculty(List<com.astha.bean.faculty> faculty) {
        this.faculty = faculty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", faculty=" + faculty +
                '}';
    }
}
