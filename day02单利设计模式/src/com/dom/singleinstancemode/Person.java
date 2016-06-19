package com.dom.singleinstancemode;

public class Person {
	//饿汉式
	public static final Person p = new Person();

private String name;
//构造函数私有化(无法直接创建对象)
private Person() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
//创建一个获取对象的全局方法
public static Person getPerson(){
//	return new Person();
	return p;//饿汉式

}
}
