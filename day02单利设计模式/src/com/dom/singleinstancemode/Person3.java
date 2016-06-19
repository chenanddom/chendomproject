package com.dom.singleinstancemode;

public class Person3 {
	//����ʽ
//	public static final Person p = new Person();
	public static Person3 p;
private String name;
//���캯��˽�л�(�޷�ֱ�Ӵ�������)
private Person3() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
//����һ����ȡ�����ȫ�ַ���
public static Person3 getPerson(){
//	return new Person();
//	return p;//����ʽ
	if(p==null){
		synchronized(Person3.class){
			if(p==null){
				p=new Person3();	
			}
		}
	}
	return p;
}
}
