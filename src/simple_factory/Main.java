package simple_factory;

public class Main {
	public static void main(String[] args) throws Exception {
		Operation o = OperationFactory.createOperation('+');
		o.setNumberA(1);
		o.setNumberB(2);
		System.out.println(o.getResult());
	}
}
