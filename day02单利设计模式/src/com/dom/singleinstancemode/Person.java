package com.dom.singleinstancemode;

public class Person {
	//����ʽ
	public static final Person p = new Person();

private String name;
//���캯��˽�л�(�޷�ֱ�Ӵ�������)
private Person() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
//����һ����ȡ�����ȫ�ַ���
public static Person getPerson(){
//	return new Person();
	return p;//����ʽ

}
}
