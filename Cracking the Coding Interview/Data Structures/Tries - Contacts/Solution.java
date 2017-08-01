import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static void addContact(String contact, HashMap<String, Integer> contacts) {
        // add all substrings of contact to map
        for(int i = contact.length() - 1; i >= 0; i--) {
            String current = contact.substring(0, i);
            if(contacts.get(current) != null) {
                contacts.put(current, contacts.get(current) + 1);
            } else {
                contacts.put(current, 1);
            }
        }
    }

    public static int findContact(String toFind, HashMap<String, Integer> contacts) {
        if(contacts.get(toFind) != null) {
            return contacts.get(toFind);
        } else {
            return 0;
        }
    }


    public static class Node {
        private static int NUM_CHAR = 26;
        Node[] children = new Node[NUM_CHAR];
        int numWords = 0;

        private static int getCharIndex(char c) {
            return c - 'a';
        }

        private Node getNode(char c) {
            return children[getCharIndex(c)];
        }

        private void setNode(char c, Node node) {
            children[getCharIndex(c)] = node;
        }

        public void add(String s) {
            add(s, 0);
        }

        // add the given string to trie
        private void add(String s, int index) {
            numWords++;
            if(index == s.length()) return;
            char current = s.charAt(index);
            int idx = getCharIndex(current);
            // check if child exists, otherwise create, traverse, add
            Node child = getNode(current);
            if(child == null) {
                child = new Node();
                setNode(current, child);
            }
            child.add(s, index + 1);
        }

        // find number of children of a prefix
        // iterate until length of string, return that child numWords
        public int find(String s) {
            return findCount(s, 0);
        }

        private int findCount(String s, int index) {
            if(s.length() == index) return numWords;
            Node child = getNode(s.charAt(index));
            if(child == null) return 0;
            return child.findCount(s, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Node trie = new Node();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")) {
                trie.add(contact);
            } else {
                System.out.println(trie.find(contact));
            }
        }
    }
}
