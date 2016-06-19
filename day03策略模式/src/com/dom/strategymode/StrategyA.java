package com.dom.strategymode;

import java.util.Random;

public class StrategyA implements Strategy {

	@Override
	public int randChoice() {
		// TODO Auto-generated method stub
		
		return (int)(Math.random()*30);
	}

}
