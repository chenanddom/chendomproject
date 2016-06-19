package com.dom.dynamicproxymode;

import java.lang.reflect.Proxy;

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealSubject realSubject =new RealSubject();
		DynamicProxy dynamicProxy = new DynamicProxy();
		dynamicProxy.setRealSubject(realSubject);
		Subject subject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
				RealSubject.class.getInterfaces(),dynamicProxy);
		subject.sailBook();

	}

}
