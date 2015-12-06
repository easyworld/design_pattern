package strategy;

public class CashRebate implements CashSuper {
	private double moneyRebate = 1.0d;

	public CashRebate(double moneyRebate) {
		this.moneyRebate = moneyRebate;
	}

	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}
}
