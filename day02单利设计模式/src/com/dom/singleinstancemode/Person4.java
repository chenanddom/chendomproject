package com.dom.singleinstancemode;

public class Person4 {
	//����ʽ
//	public static final Person p = new Person();
	public static Person4 p;
private String name;
//���캯��˽�л�(�޷�ֱ�Ӵ�������)
private Person4() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
//����һ����ȡ�����ȫ�ַ���
public static Person4 getPerson(){
//	return new Person();
//	return p;//����ʽ
	if(p==null){
		p=new Person4();
	}
	return p;
}
}
