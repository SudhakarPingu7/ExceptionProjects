package ArrayList;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student stu1=new Student("mani",1,"male",6,90,15);
		Student stu2=new Student("Raj",3,"male",6,80,16);
		Student stu3=new Student("shreya",8,"female",5,93,15); 
		Student stu4=new Student("raja",9,"male",9,80,16);
		Student stu5=new Student("roja",7,"female",10,99,14);
		Student stu6=new Student("mariya",10,"female",12,78,12);
		ArrayList<Student> students=new ArrayList<>();
		       students.add(stu1);
		       students.add(stu2);
		       students.add(stu3);
		       students.add(stu4);
		       students.add(stu5);
		       students.add(stu6);
		       ArrayList<Student> male=new ArrayList<>();
		for(Student s:students) {
			if(s.getgender().equals("male")) {
				male.add(s);
			}
		}
	    System.out.println(male);
	    ArrayList<Student> female=new ArrayList<>();
	
	for(Student s1:students) {
		if(s1.getgender().equals("female")) {
			female.add(s1);
			}
	}System.out.println(female);
		}
	}class Student {
	private String name;
	private int rollno;
	private String gender;
	private int std;
	private int mark;
	private int age;
	
	public void setname(String name) {
		this.name=name;
	}public String getname() {
		return name;
		}public void setrollno(int rollno) {
		this.rollno=rollno;
	}public int getrollno() {
		return rollno;
	}public void setgender(String gender) {
		this.gender=gender;
	}public String getgender() {
		return gender;
	}public void setstd(int std) {
		this.std=std;
	}public int getstd() {
		return std;
	}public void setmark(int mark) {
		this.mark=mark;
	}public int getmark() {
		return mark;
	}public void setage(int age) {
		this.age=age;
	}public int getage() {
		return age;
		}public Student(String name,int rollno,String gender,int std,int mark,int age) {
		this.name=name;
		this.rollno=rollno;
		this.gender=gender;
		this.std=std;
		this.mark=mark;
		this.age=age;
	}public String toString() {
		return name+" "+rollno+" "+gender+" "+std+" "+mark+" "+age;
	}
}
