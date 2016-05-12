package com.dom.singleinstancemode;

public class Person3 {
	//饿汉式
//	public static final Person p = new Person();
	public static Person3 p;
private String name;
//构造函数私有化(无法直接创建对象)
private Person3() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
//创建一个获取对象的全局方法
public static Person3 getPerson(){
//	return new Person();
//	return p;//饿汉式
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
