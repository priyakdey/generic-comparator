package io.priyak.genericcomparator;

/**
 * Class GenericComparator<T> is a Generic Comparator
 * Instance of this comparator will help sort user-defined objects having multiple fields
 * during runtime according to inputs
 * 
 * NOTE : Classes having association relation with the object type to be sorted are
 * to implement the Comparable<U> interface and override the copmareTo(Object o) method
 * 
 * In case the associative objects are having association relations in them, logic needs to be 
 * implemented accordingly (most likely to be sorted by any Java pre-defined type Object)
 *
 * @author  priyakdey
 */

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

public class GenericComparator<T> implements Comparator<T> {

    private T t;
    private String inputField;

    public GenericComparator(String inputField){
	this.inputField = inputField;
    }
    
    public T getT() {
	return t;
    }

    public void setT(T t) {
	this.t = t;
    }

    @Override
    public int compare(T o1, T o2) {
	return getComparator(o1, o2);
    }
    
    public int getComparator(T o1, T o2) {
	return this.invokeGetter(o1).compareTo(this.invokeGetter(o2));
    }
    
    public <U extends Comparable<U>> U invokeGetter(Object o) {
	PropertyDescriptor pd;
	U field = null;
	try {
	    pd = new PropertyDescriptor(inputField, o.getClass());
	    Method getterMethod = pd.getReadMethod();
	    /*
	     *  Need to ensure that there is no ClassCastException
	     *  TODO : Need to think of use cases for Execption or a better way of impl
	     */
	    field = (U) getterMethod.invoke(o);
	    
	} catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
	    e.printStackTrace();
	}
	
	return field;
    }

}
