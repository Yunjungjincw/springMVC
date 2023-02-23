package com.ourcom.model;



public class MemberVO {
	private int num; 
	private String id;
	private String pass; 
	private String name;  
	private int age;  
	private String email; 
	private String phone;
	private String filename;
	
	public MemberVO() {}
	
	
	// 회원 가입용 생성자
	public MemberVO(String id, String pass, String name, int age, String email, String phone,String filename) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.filename = filename;
	} 
	
	// DAO 나 DB에서 값 가져올 때 묶는 ?
	public MemberVO(int num, String id, String pass, String name, int age, String email, String phone) {
		this.num = num;
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
	}

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}


	@Override
	public String toString() {
		return "MemberVO [num=" + num + ", id=" + id + ", pass=" + pass + ", name=" + name + ", age=" + age + ", email="
				+ email + ", phone=" + phone + ", filename=" + filename + "]";
	}


	
	
	
	
}
