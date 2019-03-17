package io.priyak.genericcomparator.test;

import java.util.ArrayList;
import java.util.List;

import io.priyak.genericcomparator.model.Address;
import io.priyak.genericcomparator.model.Student;

public class DummyStudentList {
    
    
    private DummyStudentList() {
	
    }
    
    public static List<Student> getStudents() {
	List<Student> students = new ArrayList<>(0);
	
	Student student1 = new Student();
	Address address1 = new Address();
	student1.setRollNo(1000);
	student1.setFirstName("Amit");
	student1.setLastName("Shah");
	address1.setCountry("Zimbabwe");
	student1.setAddress(address1);

	students.add(student1);

	Student student2 = new Student();
	Address address2 = new Address();
	student2.setRollNo(1001);
	student2.setFirstName("Amit");
	student2.setLastName("Kumar");
	address2.setCountry("India");
	student2.setAddress(address2);

	students.add(student2);

	Student student3 = new Student();
	Address address3 = new Address();
	student3.setRollNo(1003);
	student3.setFirstName("John");
	student3.setLastName("Doe");
	address3.setCountry("United Kingdom");
	student3.setAddress(address3);

	students.add(student3);

	
	Student student4 = new Student();
	Address address4 = new Address();
	student4.setRollNo(1004);
	student4.setFirstName("Vishal");
	student4.setLastName("Jutta");

	address4.setCountry("Uganda");
	student4.setAddress(address4);

	students.add(student4);

	return students;
    }

}
