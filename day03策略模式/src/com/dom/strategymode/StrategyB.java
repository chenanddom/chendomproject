package com.dom.strategymode;

import java.util.Random;

public class StrategyB implements Strategy {

	@Override
	public int randChoice() {
		// TODO Auto-generated method stub
		return new Random().nextInt(10);
	}

}
