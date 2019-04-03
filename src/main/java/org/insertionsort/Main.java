package org.insertionsort;

public class Main {

	public static void main(String[] args) {
		
		/*Integer */
		Integer a[] = {4,5,9,10,13,7,9,6,2,12};
		
		InsertionSort<Integer> insertionSort = new InsertionSort<>(a);
		insertionSort.order(a);
		insertionSort.print(a);
		
		/*Double */
		Double d[] = {4.0, 5.0, 9.2, 10.0, 13.3, 7.4, 9.4, 6.4, 2.0, 12.0};
		
		InsertionSort<Double> insertionSort1 = new InsertionSort<>(d);
		insertionSort1.order(d);
		insertionSort1.print(d);
		
		/*Long */
		Long l[] = {4233233l, 5232323l, 92455l, 1002222l, 132442423l, 744l, 94l, 64l, 20l, 12077l};
		
		InsertionSort<Long> insertionSort2 = new InsertionSort<>(l);
		insertionSort2.order(l);
		insertionSort2.print(l);
		
		/*Character */
		Character c[] = {'b', 'd', 'f','a','b','c','z','h','y'};
		
		InsertionSort<Character> insertionSort3 = new InsertionSort<>(c);
		insertionSort3.order(c);
		insertionSort3.print(c);
		
		/*String */
		String s[] = {"daniele","Daniele","Antonio", "Fratello","Carmela"};
		
		InsertionSort<String> insertionSort4 = new InsertionSort<>(s);
		insertionSort4.order(s);
		insertionSort4.print(s);
	}

}
