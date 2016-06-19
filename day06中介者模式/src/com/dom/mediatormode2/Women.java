package com.dom.mediatormode2;

public class Women extends Person {

	public Women(String name, int condition,Mediator mediator) {
		super(name, condition,mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getPartner(Person p) {
		this.getMediator().setWomen(this);//将自己注册进婚介机构
		this.getMediator().getPartner(p);

	}

}
