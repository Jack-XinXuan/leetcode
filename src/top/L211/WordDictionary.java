package top.L211;

public class WordDictionary {

    private TrieNode root = new TrieNode();

    public void addWord(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }

    public boolean search(String word) {
        return match(word.toCharArray(), 0, root);
    }

    private boolean match(char[] chs, int k, TrieNode node) {

        if (k == chs.length) {
            return node.isWord;
        }

        if (chs[k] == '.') {
            //'.'要把所有字都找過一遍
            for (int i = 0; i < node.children.length; i++) {
                if (node.children[i] != null && match(chs, k + 1, node.children[i])) {
                    return true;
                }
            }
        } else {
            return node.children[chs[k] - 'a'] != null && match(chs, k + 1, node.children[chs[k] - 'a']);
        }
        return false;
    }

    public static class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public boolean isWord;
    }
}