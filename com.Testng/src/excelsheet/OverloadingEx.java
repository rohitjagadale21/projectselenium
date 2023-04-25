package excelsheet;

public class OverloadingEx {
	
	public void add(int a) {
		System.out.println(a);
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}
	public static void main(String[] args) {
		
		OverloadingEx dp = new OverloadingEx();
		
		dp.add(10);
		dp.add(10, 20, 30);
		
	}
}

