package arraysAndHashing;
import java.util.ArrayList;
import java.util.List;

public class StringEncodeAndDecode {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("neet");
		list.add("code");
		list.add("love");
		list.add("you");
		System.out.println(encode(list));
//		System.out.println(decode("neet code love you"));
//		System.out.println(decode("4neet#4code#4love#3you#"));
		System.out.println(decode(encode(list)));
	}
	
	public static String encode(List<String> strs) {
		StringBuilder sb = new StringBuilder();
		for (String str : strs) {
			sb.append(str.length()).append("#").append(str);
		}
		return sb.toString();
	}
	
	public static List<String> decode(String str) {
		List<String> list = new ArrayList<>();
		int i = 0;
		while (i < str.length()) {
			int j = i;
			while (str.charAt(j) != '#')
				j++;
			int length = Integer.valueOf(str.substring(i, j));
			i = j + 1 + length;
			list.add(str.substring(j + 1, i));
		}
		return list;
	}
}