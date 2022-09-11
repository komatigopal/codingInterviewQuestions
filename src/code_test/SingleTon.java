package code_test;

public class SingleTon {
	private SingleTon obj;

	private SingleTon() {
	}

	public SingleTon getInstance() {
		if (null == obj)
			obj = new SingleTon();
		return obj;
	}
}
