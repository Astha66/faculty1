package com.astha.bean;

import javax.persistence.*;
import java.util.*;

@Entity
public class faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fid;
    private String fname;
    private String fpassword;
    //image_path VARCHAR(255) NOT NULL;

    @ManyToOne
    private Course cour;

    public Course getCour() {
        return cour;
    }

    public void setCour(Course cour) {
        this.cour = cour;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFpassword() {
        return fpassword;
    }

    public void setFpassword(String fpassword) {
        this.fpassword = fpassword;
    }
}
