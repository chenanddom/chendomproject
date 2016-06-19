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
			System.out.println("死变态");
		}else if(p instanceof Man){
			if(this.getCondition()==p.getCondition())
				System.out.println(this.getName()+"和"+p.getName()+"般配可以结婚");
			else
			System.out.println("条件不匹配捏");
		}
	}

}
