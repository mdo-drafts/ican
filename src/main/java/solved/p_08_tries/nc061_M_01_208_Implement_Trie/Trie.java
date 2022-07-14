package solved.p_08_tries.nc061_M_01_208_Implement_Trie;

public class Trie {

    class TrieNode {

        char c;
        boolean isEnd;
        TrieNode[] child = new TrieNode[26];

        public TrieNode(char c) {
            this.c = c;
        }
    }

    TrieNode[] root = new TrieNode[26];

    public Trie() {

    }

    public void insert(String word) {
        TrieNode[] curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr[c - 'a'] == null) {
                curr[c - 'a'] = new TrieNode(c);
            }
            if (i == word.length() - 1) {
                curr[c - 'a'].isEnd = true;
            }
            curr = curr[c - 'a'].child;
        }
    }

    public boolean search(String word) {
        TrieNode[] curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr[c - 'a'] == null) {
                return false;
            }
            if (i == word.length() - 1 && !curr[c - 'a'].isEnd) {
                return false;
            }
            curr = curr[c - 'a'].child;
        }
        return true;
    }

    public boolean startsWith(String prefix) {
        TrieNode[] curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (curr[c - 'a'] == null) {
                return false;
            }
            curr = curr[c - 'a'].child;
        }
        return true;
    }
}
