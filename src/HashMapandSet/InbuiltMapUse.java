package HashMapandSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class InbuiltMapUse {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("abc", 1);
		map.put("def", 3);
		map.put("ghi", 4);
		map.put("xyz", 8);
		System.out.println(map.size());
		if (map.containsKey("abc"))
			System.out.println("Map has abc");
		if (map.containsKey("abc1"))
			System.out.println("Map has abc1");
		
		int v = map.get("abc");
		System.out.println(v);
		int w = 0;
		if (map.containsKey("ab"))
			w = map.get("ab");
		System.out.println(w);
		map.remove("abc");
		
		// iterate
		Set<String> keys = map.keySet();
		for (String s : keys)
			System.out.println(map.get(s));
	}
}