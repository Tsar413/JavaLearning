package com.company.javaRelearn;

import java.util.*;

public class Trie_20241111 {
    class Trie {
        private List<String> list;
        private Set<String> set;

        public Trie() {
            this.list = new ArrayList<String>();
            this.set = new HashSet<String>();
        }

        public void insert(String word) {
            this.list.add(word);
            for (int i = 0; i < word.length(); i++) {
                set.add(word.substring(0, i + 1));
            }
        }

        public boolean search(String word) {
            return list.contains(word);
        }

        public boolean startsWith(String prefix) {
            return set.contains(prefix);
        }
    }
}
