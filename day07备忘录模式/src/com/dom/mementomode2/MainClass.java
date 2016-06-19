package com.dom.mementomode2;

public class MainClass {

	public static void main(String[] args) {
		Person p1 = new Person("张三", "男", 23);
		p1.display();
		System.out.println("-------------------");
		Memento memento = p1.createMemento();
		CrareTaker crareTaker = new CrareTaker();
		crareTaker.setMemento(memento);
		p1.setName("张三丰");
		p1.setAge(28);
		p1.display();
		System.out.println("-------------------");
		p1.setMemento(crareTaker.getMemento());
		p1.display();
		System.out.println("-------------------");
		
		
	}

}
