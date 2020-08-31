package com.demo.bean;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Demo {

	private Integer studentId; // OID ：与表中主键进行映射，用于表示对象在内存唯一性。
	private String studentName;
	private Date birthday;

	public Demo() {
		super();
	}

	public Demo(Integer studentId, String studentName, Date birthday) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.birthday = birthday;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName="
				+ studentName + ", birthday=" + birthday + "]";
	}
}
