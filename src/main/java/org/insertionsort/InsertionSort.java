package org.insertionsort;

/**
 * 
 * @author Daniele Damiano
 * Parte dalla prima posizione memorizzando il a[i] nella variabile prossimo 
 * Poi iterativamente procede all'indiero confrontando i prossimi elementi,
 * Se nr trova uno maggiore di prossimo cioe maggiore dell'indice a[i] lo copia nella posizione precedente 
 * E riprocede con la scansione cercando altri elementi maggiore di prossimo.
 * Al termine l'array risulta essere ordinato in tempo (Theta(n^2) al caso pessimo), O(n) se la sequenaza risulta ordinata solo in parte 
 *
 * @param <T> Un tipo qualsiasi di classe con il vincolo di essere un tipo confrontabile perchè estende 
 * Comparable<T> 
 */
public class InsertionSort<T extends Comparable<T>> {
	
	private T[] a;
	private T prossimo;
	private int j;
	
	/**
	 * 
	 * @param a Un array di un tipo wrapper qualsiasi Double, Integer ...
	 */
	public InsertionSort(T[] a) {
		this.a = a;
		this.prossimo = null;
		j = 0;
	}
	
	  
	
	/**
	 * 
	 * @param a Un array di un tipo wrapper qualsiasi Double, Integer ...
	 */
	public void order(T[] a) {
		  for(int i = 1; i < a.length; i++) {
			  prossimo = a[i];
			  j  = i;
			   while ((j > 0) && a[j - 1].compareTo(prossimo) > 0) {
				a[j] = a[j - 1];
				j = j - 1;
				
			}
			a[j] = prossimo;   
		  }
				  
	}
	
	/**
	 * 
	 * @param a Un array di un tipo wrapper qualsiasi Double, Integer ...
	 */
	public void print(T[] a) {
		System.out.println("Tipo = "+ " " + a.getClass().getName());
		
		for(T b : a) {
			System.out.println(b);
		}
	}




	public T[] getA() {
		return a;
	}




	public void setA(T[] a) {
		this.a = a;
	}




	public T getProssimo() {
		return prossimo;
	}




	public void setProssimo(T prossimo) {
		this.prossimo = prossimo;
	}
	
	
	
	
	
}
