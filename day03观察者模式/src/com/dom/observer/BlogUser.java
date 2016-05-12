package com.dom.observer;

import java.util.Observable;

public class BlogUser extends Observable {
public void publishBlog(String articleTitle,String articleContent){
	Article article = new Article();
	article.setArticleTitle(articleTitle);
	article.setArticleContent(articleContent);
	System.out.println("你发布了新文章:"+articleTitle+"\n"+articleContent);
	this.setChanged();//设置内容已经改变
	this.notifyObservers(article);//通知观察者
	
}
}
