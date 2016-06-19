package com.dom.dynamicproxymode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
private RealSubject realSubject;

	public void setRealSubject(RealSubject realSubject) {
	this.realSubject = realSubject;
}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result=null;
		 discount();
		result=method.invoke(realSubject, args);
		voucher();
		return result;
	}
	public void discount(){
		System.out.println("´òÕÛ");
	}
	public void voucher(){
		System.out.println("´ú½ðÈ¯");
	}
}
