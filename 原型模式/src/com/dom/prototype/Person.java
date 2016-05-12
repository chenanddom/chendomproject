package com.dom.prototype;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {
private String name;
private int age;
private String sex;
//这里是一个引用对象
private List<String> friendlist;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}

public List<String> getFriendlist() {
	return friendlist;
}
public void setFriendlist(List<String> friendlist) {
	this.friendlist = friendlist;
}

@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", sex=" + sex
			+ ", friendlist=" + friendlist + "]";
}
public Person clonePerson(){
	try {
		Person p=(Person) super.clone();
		ArrayList<String> list=new ArrayList<String>();
		
		for(String name:this.getFriendlist()){
			list.add(name);
		}
		p.setFriendlist(list);
		return p;
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return null;
	}
}
}
