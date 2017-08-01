//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static Map<String, Integer> contacts = new HashMap<String, Integer>();

    public static void addContact(String name, int phone) {
        if(contacts.get(name) == null) {
            contacts.put(name, phone);
        }
    }

    public static Integer getContact(String name) {
        if(contacts.get(name) != null) {
            return contacts.get(name);
        } else {
            return -1;
        }
    }

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            addContact(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            Integer ph = getContact(s);
            if(ph != -1) {
                System.out.println(s + "=" + ph);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
