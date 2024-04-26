package chap13.exm04;

public class Container<K, V>{
	
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	/*
	public void set (K key) {
		this.key = key;
	}
	
	public void set (V value) {
		this.value = value;
	}*/ // Container<K,V> 해놔서 그런지 따로는 안되네
	
	public void set(K key,V value) {
		this.key=key;
		this.value=value;
	}
}
