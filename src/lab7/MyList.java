package lab7;

import lab6.Ammunition;

import java.util.*;

public class MyList implements List<Ammunition> {
    private Node head;
    private Node tail;
    private int size;

    public MyList() {
    }

    public MyList(Ammunition ammunition) {
        add(ammunition);
    }

    public MyList(Collection<? extends Ammunition> collection) {
        addAll(collection);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Ammunition ammunition :
                this) {
            if (ammunition.equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Ammunition> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<Ammunition> {
        private Node currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public Ammunition next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            } else {
                Ammunition ammunition = currentNode.getAmmunition();
                currentNode = currentNode.getNext();
                return ammunition;
            }
        }
    }

    @Override
    public Object[] toArray() {
        Object[] arrayAmmunition = new Ammunition[size];
        int index = 0;
        for (Ammunition ammunition :
                this){
            arrayAmmunition[index] = ammunition;
            index++;
        }
        return arrayAmmunition;
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(Ammunition ammunition) {
        Node node = new Node(ammunition, null);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        boolean isAllInCollection = true;
        for (Object o:
                collection) {
            isAllInCollection &= this.contains(o);
        }
        return isAllInCollection;
    }

    @Override
    public boolean addAll(Collection<? extends Ammunition> collection) {
        boolean isCollectionChanged = false;
        for (Ammunition ammunition : collection) {
            isCollectionChanged |= add(ammunition);
        }
        return isCollectionChanged;
    }

    @Override
    public boolean addAll(int i, Collection<? extends Ammunition> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Ammunition get(int i) {
        int index = 0;
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            for (Ammunition ammunition : this) {
                if (index == i) {
                    return ammunition;
                }
                index++;
            }
        }
        return null;
    }

    @Override
    public Ammunition set(int i, Ammunition ammunition) {
        return null;
    }

    @Override
    public void add(int i, Ammunition ammunition) {

    }

    @Override
    public Ammunition remove(int i) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        for (Ammunition ammunition :
                this) {
            if(ammunition.equals(o)){
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        int counter = 0;
        for (Ammunition ammunition :
                this) {
            if (ammunition.equals(o)) {
                index = counter;
            }
            counter++;
        }
        return index;
    }

    @Override
    public ListIterator<Ammunition> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Ammunition> listIterator(int i) {
        return null;
    }

    @Override
    public List<Ammunition> subList(int i, int i1) {
        return null;
    }
}
