# generic-comparator

This is a generic comparator which does help sort List of UserDefined Objects by the field selected during runtime.


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
 *
 */
