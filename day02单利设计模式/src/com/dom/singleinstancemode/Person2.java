package com.dom.singleinstancemode;

public class Person2 {
public static Person2 p;
private String name;
//���캯��˽�л�(�޷�ֱ�Ӵ�������)
private Person2() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
//����һ����ȡ�����ȫ�ַ���
public static Person2 getPerson(){

	if(p==null){
		p=new Person2();
	}
	return p;
}
}
