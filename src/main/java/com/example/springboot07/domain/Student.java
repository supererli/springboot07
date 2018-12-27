package com.example.springboot07.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_student")
public class Student {

  private long sno;
  private String sname;
  private long sage;
  private String ssex;
  private String saddress;
  private String sclass;
  private java.sql.Date birthday;


  public long getSno() {
    return sno;
  }

  public void setSno(long sno) {
    this.sno = sno;
  }


  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }


  public long getSage() {
    return sage;
  }

  public void setSage(long sage) {
    this.sage = sage;
  }


  public String getSsex() {
    return ssex;
  }

  public void setSsex(String ssex) {
    this.ssex = ssex;
  }


  public String getSaddress() {
    return saddress;
  }

  public void setSaddress(String saddress) {
    this.saddress = saddress;
  }


  public String getSclass() {
    return sclass;
  }

  public void setSclass(String sclass) {
    this.sclass = sclass;
  }


  public java.sql.Date getBirthday() {
    return birthday;
  }

  public void setBirthday(java.sql.Date birthday) {
    this.birthday = birthday;
  }

}
