package com.jun.daopattern;

public class DaoPatternDemo {
	public static void main(String[] args) {
		StudentDao dao = new StudentDaoImpl();
		
		for (Student student : dao.getAllStudents()) {
			System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}
		
		Student student = dao.getAllStudents().get(0);
		student.setName("Michael");
		dao.updateStudent(student);

		dao.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	}
}
