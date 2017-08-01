public class Solution {

    class Node {
        char data;
        Node next;
        public Node(char data) {
            this.data = data;
            next = null;
        }
    }

    static Node queueHead = null, queueLast = null;
    static Node stackHead = null;

    void pushCharacter(char ch) {
        Node toInsert = new Node(ch);
        if(this.stackHead == null) {
            stackHead = toInsert;
        } else {
            toInsert.next = stackHead;
            stackHead = toInsert;
        }
    }


    char popCharacter() {
        char pop = stackHead.data;
        stackHead = stackHead.next;
        return pop;
    }

    void enqueueCharacter(char ch) {
        Node toInsert = new Node(ch);
        if(queueLast != null) {
            queueLast.next = toInsert;
        }

        queueLast = toInsert;

        if(queueHead == null) {
            queueHead = toInsert;
        }
    }

    char dequeueCharacter() {
        char dequeue = queueHead.data;
        queueHead = queueHead.next;
        if(queueHead == null) queueLast = null;
        return dequeue;
    }
