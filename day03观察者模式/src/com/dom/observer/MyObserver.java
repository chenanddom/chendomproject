package com.dom.observer;

import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Article article = (Article)arg;
		System.out.println("博主发表了新文章，快去看看吧！");
		System.out.println("博客主题是:"+article.getArticleTitle());
		System.out.println("博客内容是:"+article.getArticleContent());
		
	}

}
