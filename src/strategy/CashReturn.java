package strategy;

/**
 * 满xx返yy
 * 
 * @author royz
 *
 */
public class CashReturn implements CashSuper {
	private double moneyCondition = 0.0d;
	private double moneyReturn = 0.0d;

	/**
	 * 满moneyCondition返moneyReturn
	 */
	public CashReturn(double moneyCondition, double moneyReturn) {
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}

	@Override
	public double acceptCash(double money) {
		double result = money;
		if (money >= moneyCondition)
			result = money - Math.floor(money / moneyCondition) * moneyReturn;
		return result;
	}
}
