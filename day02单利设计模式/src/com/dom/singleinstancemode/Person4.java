package com.dom.singleinstancemode;

public class Person4 {
	//饿汉式
//	public static final Person p = new Person();
	public static Person4 p;
private String name;
//构造函数私有化(无法直接创建对象)
private Person4() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
//创建一个获取对象的全局方法
public static Person4 getPerson(){
//	return new Person();
//	return p;//饿汉式
	if(p==null){
		p=new Person4();
	}
	return p;
}
}
