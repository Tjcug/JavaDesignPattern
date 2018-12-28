package com.basic.inerclass;

/**
 * �ڲ���SingletonHandlerֻ����getInstance()������һ�ε��õ�ʱ��Żᱻ���أ�ʵ�����ӳټ���Ч����
 * ��������ع������̰߳�ȫ�ģ�ʵ���̰߳�ȫ�����ڲ�����ص�ʱ��ֻʵ������һ��instance
 */
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;

	private static class ChocolateBoilerHolder{
		private static ChocolateBoiler uniqueInstance=new ChocolateBoiler();
	}

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
  
	public static ChocolateBoiler getInstance() {
		return ChocolateBoilerHolder.uniqueInstance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the boiler with a milk/chocolate mixture
		}
	}
 
	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the boiled milk and chocolate
			empty = true;
		}
	}
 
	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// bring the contents to a boil
			boiled = true;
		}
	}
  
	public boolean isEmpty() {
		return empty;
	}
 
	public boolean isBoiled() {
		return boiled;
	}
}
