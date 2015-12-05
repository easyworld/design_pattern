package simple_factory;

public class OperationFactory {
	public static Operation createOperation(char operate) {
		Operation o;
		switch (operate) {
		case '+':
			o = new OperationAdd();
			break;
		case '-':
			o = new OperationSub();
			break;
		case '*':
			o = new OperationMul();
			break;
		case '/':
			o = new OperationDiv();
			break;
		default:
			o = null;
		}
		return o;
	}
}
