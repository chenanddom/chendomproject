package com.dom.visitormode;

/**
 * 这是公园类，代表了公园的每一部分
 * @author adminster
 *
 */
public interface ParkElement {
	//用来接纳访问者的
public void accept(Visitor visitor);
}
