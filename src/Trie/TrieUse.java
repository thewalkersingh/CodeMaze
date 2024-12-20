package Trie;
public class TrieUse {
	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.add("hello");
		trie.add("no");
		trie.add("note");
		trie.add("and");
		trie.add("bat");
		
		System.out.println(trie.search("bat"));
		System.out.println(trie.search("pri"));
		trie.remove("bat");
		System.out.println(trie.startsWith("hell"));
	}
}