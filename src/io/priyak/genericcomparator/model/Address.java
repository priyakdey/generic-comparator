package io.priyak.genericcomparator.model;

public class Address implements Comparable<Address> {

    private String country;

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    @Override
    public int compareTo(Address o) {
	return this.country.compareTo(o.country);
    }

    @Override
    public boolean equals(Object o) {
	return o instanceof Address && this.country.equals(((Address) o).country);
    }

    @Override
    public int hashCode() {
	return this.country.hashCode();
    }

    @Override
    public String toString() {
	return country;
    }
}
