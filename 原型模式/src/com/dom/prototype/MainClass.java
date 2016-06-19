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
		p1.setSex("男");
		friends.add("李四");
		friends.add("王五");
		p1.setFriendlist(friends);
		Person p2=p1.clonePerson();
		friends.add("赵六");
		p2.setFriendlist(friends);
		friends.add("周琦");
		p1.setFriendlist(friends);*/
//		p2.setName("lisi");
		/*
		 * Person p2=new Person();
		 * p2.setName("lisi");
		p2.setAge(25);
		p2.setSex("男");*/
		
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
		friends.add("哈哈");
		p2.setFriendlist(friends);
		
		System.out.println(p1.getFriendlist()+"===="+p2.getFriendlist());
	}

}
