public class LC_211_Design_Add_and_Search_Words_Data_Structure {
    class WordDictionary {

        Node root;
        public class Node{
            Node[] childrens;
            boolean isWord;

            public Node(){
                childrens = new Node[26];
            }

            public boolean find(String word,int i){
                if(i==word.length()){
                    return isWord;
                }
                if(word.charAt(i) == '.'){
                    for(Node children : childrens){
                        if(children != null && children.find(word,i+1)){
                            return true;
                        }
                    }
                    return false;
                }else{
                    if(childrens[word.charAt(i)-'a'] == null){
                        return false;
                    }else{
                        return childrens[word.charAt(i)-'a'].find(word,i+1);
                    }
                }
            }
        }
        /** Initialize your data structure here. */
        public WordDictionary() {
            root = new Node();
        }

        public void addWord(String word) {
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

        public boolean search(String word) {
            return root.find(word,0);
        }


    }

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
}
