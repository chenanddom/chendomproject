package com.dom.strategymode;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ﶼû��ʵ�ֶ��㷨�ķ�װ
/*		Strategy strategy1 = new StrategyA();
		int num = strategy1.randChoice();
		System.out.println("�����:"+num);
		Strategy strategy2 = new StrategyB();
		int num2 = strategy2.randChoice();
		System.out.println("�����-:"+num2);*/
		Strategy strategy1 = new StrategyA();
		Context context = new Context(new StrategyB());
		int num = context.getRandomNum();
		System.out.println("�����:"+num);
	}

}
