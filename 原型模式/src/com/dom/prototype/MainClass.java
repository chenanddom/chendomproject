package com.dom.prototype;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> friends=new ArrayList<String>();
/*		Person p1=new Person();
		p1.setName("zhangsan");
		p1.setAge(25);
		p1.setSex("��");
		friends.add("����");
		friends.add("����");
		p1.setFriendlist(friends);
		Person p2=p1.clonePerson();
		friends.add("����");
		p2.setFriendlist(friends);
		friends.add("����");
		p1.setFriendlist(friends);*/
//		p2.setName("lisi");
		/*
		 * Person p2=new Person();
		 * p2.setName("lisi");
		p2.setAge(25);
		p2.setSex("��");*/
		
		Person p1=new Person();
		List<String> friends = new ArrayList<String>();
		friends.add("zhangsan");
		friends.add("lisi");
		p1.setFriendlist(friends);
		Person p2=p1.clonePerson();
		friends.add("wangwu");
		friends.add("zhaoliu");
		p1.setFriendlist(friends);
		/*friends.add("zhaoliu");
		p2.setFriendlist(friends);
		friends.add("zhouqi");
		p2.setFriendlist(friends);*/
		friends.add("����");
		p2.setFriendlist(friends);
		
		System.out.println(p1.getFriendlist()+"===="+p2.getFriendlist());
	}

}
