package dsapattern;

public class Trie {

    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    // Insert
    public void insert(String word){
        TrieNode current = root;
        System.out.println("\nInserting Word : "+word);
        for(char ch: word.toCharArray()){
            int index = ch - 'a';
            System.out.println("\nCurrent character : "+ch);
            System.out.println("\nCurrent index : "+index);
            if(current.children[index] == null){
                System.out.println("\nNode does not exist for : "+ch);
                current.children[index] = new TrieNode();
            }else{
                System.out.println("\nNode already exist for : "+ch);
            }
            current = current.children[index];
            System.out.println("\nWord inserted successfully");
            current.isEndOfWord = true;
        }
    }

    public boolean search(String word){
        TrieNode current = root;
        for(char ch: word.toCharArray()){
            int index = ch - 'a';
            if(current.children[index] == null ){
                System.out.println("Character not found");
                return false;
            }
            current = current.children[index];
        }

        if(current.isEndOfWord){
            System.out.println("Word found");
            return true;
        }
        System.out.println("Prefix exist but not the actual word");
        return false;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("app");
        trie.insert("apple");
        trie.insert("bat");
        trie.insert("battle");

        trie.search("applee");

    }
}
