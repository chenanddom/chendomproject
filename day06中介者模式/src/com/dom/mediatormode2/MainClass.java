package com.dom.mediatormode2;

public class MainClass {
public static void main(String[] args) {
	Mediator m = new Mediator();
Person man = new Man("zhangsan", 1, m);
Person women = new Women("xiaomei",1,m);
man.getPartner(women);
women.getPartner(man);
}
}
