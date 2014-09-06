package br.com.brunobs.designpatterns.observer;

public interface Subject {

	public void registrar(Observer o);
	public void remove(Observer o );
	public void notifica();
}
