package lab7;

import lab6.Ammunition;

public class Node {
    private Ammunition ammunition;
    private Node next;

    public Node(Ammunition ammunition, Node next) {
        this.ammunition = ammunition;
        this.next = next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Ammunition getAmmunition() {
        return ammunition;
    }

    public Node getNext() {
        return next;
    }
}
