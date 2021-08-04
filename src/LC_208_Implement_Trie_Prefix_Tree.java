public class LC_208_Implement_Trie_Prefix_Tree {
    class Trie {
        Node root;

        /** Initialize your data structure here. */
        public class Node{
            Node[] childrens;
            boolean isWord;
            public Node(){
                childrens = new Node[26];
            }
        }
        public Trie() {
            root = new Node();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            Node currentNode = root;
            for(int i=0;i<word.length();i++){
                char ch = word.charAt(i);
                if(currentNode.childrens[ch-'a'] == null){
                    currentNode.childrens[ch-'a'] = new Node();
                }
                currentNode = currentNode.childrens[ch-'a'];
            }
            currentNode.isWord = true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            Node currentNode = root;
            for(int i=0;i<word.length();i++){
                char ch = word.charAt(i);
                if(currentNode.childrens[ch-'a'] == null) return false;
                currentNode = currentNode.childrens[ch-'a'];
            }
            return currentNode.isWord;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            Node currentNode = root;
            for(int i=0;i<prefix.length();i++){
                char ch = prefix.charAt(i);
                if(currentNode.childrens[ch-'a'] == null) return false;
                currentNode = currentNode.childrens[ch-'a'];
            }
            return true;
        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
}
