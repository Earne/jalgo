/**
 * Design a data structure that supports the following two operations:
 * <p>
 * void addWord(word)
 * bool search(word)
 * <p>
 * search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.
 * <p>
 * Example:
 * <p>
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 * <p>
 * Note:
 * You may assume that all words are consist of lowercase letters a-z.
 *
 * @author gengyuanzhen
 */
public class WordDictionary {
    private TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public WordDictionary() {
        root = new TrieNode();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        if (word == null || word.length() == 0) {
            return;
        }
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            if (cur.getChilds()[c - 'a'] == null) {
                TrieNode newNode = new TrieNode();
                cur.getChilds()[c - 'a'] = newNode;
            }
            cur = cur.getChilds()[c - 'a'];
        }
        cur.setWord(true);
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return match(word.toCharArray(), 0, root);
    }

    private boolean match(char[] chs, int k, TrieNode node) {
        if (k == chs.length) {
            return node.isWord();
        }
        if (chs[k] != '.') {
            return node.getChilds()[chs[k] - 'a'] != null && match(chs, k + 1, node.getChilds()[chs[k] - 'a']);
        } else {
            for (int i = 0; i < node.getChilds().length; i++) {
                if (node.getChilds()[i] != null) {
                    if (match(chs, k + 1, node.getChilds()[i])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

class TrieNode {
    private boolean isWord;
    private TrieNode[] childs;


    public boolean isWord() {
        return isWord;
    }

    public void setWord(boolean word) {
        isWord = word;
    }

    public TrieNode[] getChilds() {
        return childs;
    }

    public void setChilds(TrieNode[] childs) {
        this.childs = childs;
    }

    public TrieNode() {
        this(' ', false);
    }

    public TrieNode(char c, boolean isWord) {
        this.isWord = isWord;
        this.childs = new TrieNode[26];
    }
}
