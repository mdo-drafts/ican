package unsolved.p_08_tries.nc062_M_02_211_Design_Add_and_Search_Words_Data_Structure.my_bad_01;

public class WordDictionary {

    class TrieNode {

        TrieNode[] set = new TrieNode[26];

        boolean isEnd;
    }

    TrieNode[] root = new TrieNode[26];

    public WordDictionary() {

    }

    public void addWord(String word) {
        TrieNode[] curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr[c - 'a'] == null) {
                curr[c - 'a'] = new TrieNode();
            }
            if (i == word.length() - 1) {
                curr[c - 'a'].isEnd = true;
            }
            curr = curr[c - 'a'].set;
        }
    }

    public boolean search(String word) {
        return search(root, word);
    }

    public boolean search(TrieNode[] curr, String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') {
                String subWord = word.substring(i + 1);
                for (TrieNode trieNode : curr) {
                    if (trieNode != null) {
                        if (search(trieNode.set, subWord)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                if (curr[c - 'a'] == null) {
                    return false;
                }
                if (i == word.length() - 1 && !curr[c - 'a'].isEnd) {
                    return false;
                }
                curr = curr[c - 'a'].set;
            }
        }
        return true;
    }

}
