//generic demo3

package com.capgemini.generic;

class Test3<K, V>{
	
	private K key;
	private V value;
	
	public Test3(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return "Test3 [key = " + key + " value" + value + "]";
	}
	
	public <E, N> void disply(E element, N number) {
		System.out.println("Element: " + element + "Number: " + number);
	}
}
public class GenericDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3<Integer, String> obj = new Test3<Integer, String>(10, "Joy");
		System.out.println("Key is" + obj.getKey()+"value is " + obj.getValue());
	}

}