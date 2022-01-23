package mytest;

import java.util.HashMap;
import java.util.Map;

public class ModelUse {

	public static void main(String[] args) {
		Map<String, String> model = new HashMap<>();
		String sReturn = root(model);
		printData(sReturn, model);
	}

	public static String root(Map model) {
		model.put("name1", "홍길동");
		model.put("name2", "전우치");
		return "Hello";
	}

	public static void printData(String s, Map model) {
		String str1 = (String) model.get("name1");
		System.out.println(str1);
		System.out.println("WEB-INF/views/" + s + ".jsp");
	}
}
