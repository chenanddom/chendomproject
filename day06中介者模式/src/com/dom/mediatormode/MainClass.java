package com.dom.mediatormode;

public class MainClass {
public static void main(String[] args) {
	Person p1 = new Man("����",1);
	Person p2 = new Women("����", 1);
	p1.getPartner(p2);
	p2.getPartner(p1);
}
}
