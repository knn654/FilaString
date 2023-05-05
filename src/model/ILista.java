package model;

public interface ILista {

	public boolean isEmpty();
	public int size();
	public void addFirst(String valor);
	public void addLast(String valor) throws Exception;
	public void add(String valor, int pos) throws Exception;
	public void removeFirst() throws Exception;
	public void removeLast() throws Exception;
	public void remove(int pos) throws Exception;
	public String get(int pos) throws Exception;
	
}