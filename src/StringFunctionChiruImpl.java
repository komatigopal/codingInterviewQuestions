public class StringFunctionChiruImpl implements StringFunctionChiru {

	@Override
	public String run(String str) {
		str = "Client1 " + str;
		return str;
	}

}