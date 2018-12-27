package com.example.springboot07.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_class")
public class Class {

  private long classId;
  private long classNum;
  private String grade;
  private String classTeacher;
  private String className;


  public long getClassId() {
    return classId;
  }

  public void setClassId(long classId) {
    this.classId = classId;
  }


  public long getClassNum() {
    return classNum;
  }

  public void setClassNum(long classNum) {
    this.classNum = classNum;
  }


  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }


  public String getClassTeacher() {
    return classTeacher;
  }

  public void setClassTeacher(String classTeacher) {
    this.classTeacher = classTeacher;
  }


  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

}
