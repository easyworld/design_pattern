package strategy;

public class Main {
	public static void main(String[] args) {
		// 满300返20
		CashSuper cs = new CashReturn(300, 20);
		CashContext cc = new CashContext(cs);
		System.out.println(cc.getResult(500));
	}
}
