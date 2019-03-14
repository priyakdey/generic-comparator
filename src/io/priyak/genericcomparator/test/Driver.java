package io.priyak.genericcomparator.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import io.priyak.genericcomparator.GenericComparator;
import io.priyak.genericcomparator.model.Student;

public class Driver {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static List<Student> students = new ArrayList<>(0);

    static {
	students = DummyStudentList.getStudents();
    }

    public static void main(String[] args) {
	naturalSorting();
	
	System.out.println("---------------");
	System.out.println(">> Enter the field by which to sort : ");
	
	try {
	    sort(br.readLine());
	}
	catch(IOException e) {
	    System.out.println(e.getMessage());
	}
    }

    private static void sort(String input) {
	Collections.sort(students, new GenericComparator<Student>(input));
	students.stream().forEach(System.out::println);
	
    }

    private static void naturalSorting() {
	Collections.sort(students);
	students.stream().forEach(System.out::println);

    }

}
