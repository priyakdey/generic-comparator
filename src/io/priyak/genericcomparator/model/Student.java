package io.priyak.genericcomparator.model;

public class Student implements Comparable<Student> {

    private Integer rollNo;
    private String firstName;
    private String lastName;
    private Address address;

    public Integer getRollNo() {
	return rollNo;
    }

    public void setRollNo(Integer rollNo) {
	this.rollNo = rollNo;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public Address getAddress() {
	return address;
    }

    public void setAddress(Address address) {
	this.address = address;
    }

    @Override
    public int compareTo(Student o) {
	return this.rollNo.compareTo(o.rollNo);
    }

    @Override
    public boolean equals(Object o) {
	return o instanceof Student && this.rollNo.equals(((Student) o).rollNo) ;

    }

    @Override
    public int hashCode() {
	return this.firstName.hashCode() + this.rollNo;
    }

    @Override
    public String toString() {
	return "Roll No : " + rollNo + " | Name : " + firstName + " " + 
				lastName + " | Address : " + address.toString();
    }

}
