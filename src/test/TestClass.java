package test;

public class TestClass {

	public String testMethod(String str) {
		String res = "";
		if (str.equals("おはよう")) {
			res = "朝";
		} else if (str.equals("こんにちは")) {
			res = "昼";
		} else if (str.equals("こんばんは")) {
			res = "夜";
		} else {
			res = "エラー";
		}
		return res;
	}
}