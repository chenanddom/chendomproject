package com.dom.mementomode2;

/**
 * 该类起到一个管理者的作用
 * @author adminster
 *
 */
public class CrareTaker {
private Memento memento;

public Memento getMemento() {
	return memento;
}

public void setMemento(Memento memento) {
	this.memento = memento;
}

}
