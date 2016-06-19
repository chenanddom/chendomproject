package com.dom.strategymode;

public class Context {
private Strategy strategy;

public Context(Strategy strategy) {
	this.strategy = strategy;
}
public int getRandomNum(){
	return this.strategy.randChoice();
}
}
