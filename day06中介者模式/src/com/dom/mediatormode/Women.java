package com.dom.mediatormode;

public class Women extends Person {

	public Women(String name, int condition) {
		super(name, condition);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getPartner(Person p) {
		// TODO Auto-generated method stub
		if(p instanceof Women){
			System.out.println("����̬");
		}else if(p instanceof Man){
			if(this.getCondition()==p.getCondition())
				System.out.println(this.getName()+"��"+p.getName()+"������Խ��");
			else
			System.out.println("������ƥ����");
		}
	}

}
