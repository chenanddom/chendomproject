package com.dom.mediatormode;

public class Man extends Person {

	public Man(String name, int condition) {
		super(name, condition);
		// TODO Auto-generated constructor stub
	} 

	@Override
	public void getPartner(Person p) {
		// TODO Auto-generated method stub
		if(p instanceof Man){
			System.out.println("����̬");
		}else if(p instanceof Women){
			if(this.getCondition()==p.getCondition())
			System.out.println(this.getName()+"��"+p.getName()+"������Խ��");
			else
			System.out.println("������ƥ����");
		}
	}

}
