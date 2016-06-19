package com.dom.templatemethodmode;

public abstract class ToyMode {
public abstract void toyHead();
public abstract void toyBody();
public abstract void toyTail();
public void make(){
	this.toyHead();
	this.toyBody();
	this.toyTail();
}
}
