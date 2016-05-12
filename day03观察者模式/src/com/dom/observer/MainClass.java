package com.dom.observer;

public class MainClass {
	
	public static void main(String[] args) {
		BlogUser user=new BlogUser();//创建一个被观察者
		user.addObserver(new MyObserver());//注册一个观察者
		user.publishBlog("哈哈播客", "以后多多关照");

	}

}
