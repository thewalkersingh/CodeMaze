package Trie;
public class Trie {
	private final TrieNode root;
	
	public Trie() {
		root = new TrieNode('\0');
	}
	
	private void addHelper(TrieNode root, String word) {
		if (word.isEmpty()) {
			root.isTerminal = true;
			return;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if (child == null) {
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		addHelper(child, word.substring(1));
	}
	
	public void add(String word) {
		addHelper(root, word);
	}
	
	public boolean search(String word) {
		return searchHelp(root, word);
	}
	
	private boolean searchHelp(TrieNode root, String word) {
		if (word.isEmpty()) {
			return root.isTerminal;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if (child == null)
			return false;
		return searchHelp(child, word.substring(1));
	}
	
	public void remove(String word) {
		removeHelper(root, word);
	}
	
	private void removeHelper(TrieNode root, String word) {
		if (word.isEmpty()) {
			root.isTerminal = false;
			return;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if (child == null)
			return;
		removeHelper(child, word.substring(1));
	}
	
	public void removeWhole(String word) {
		removeWholeHelper(root, word);
	}
	
	private void removeWholeHelper(TrieNode root, String word) {
		if (word.isEmpty()) {
			root.isTerminal = false;
			return;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if (child == null)
			return;
		removeWholeHelper(child, word.substring(1));
		if (!child.isTerminal && child.childCount == 0) {
			root.children[childIndex] = null;
			root.childCount--;
		}
	}
	
	public boolean startsWith(String prefix) {
		return startsWithHelper(root, prefix);
	}
	
	private boolean startsWithHelper(TrieNode root, String word) {
		if (word.isEmpty()) {
			return true;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if (child == null)
			return false;
		return searchHelp(child, word.substring(1));
	}
}