package module2.binaryTreeForder;

import java.util.List;

public class PreorderTreeNode<T, K> extends Node<T, K> {
    public PreorderTreeNode(T value) {
        super(value, null, null);
    }

    public PreorderTreeNode(T value, Node leftChild) {
        super(value, leftChild, null);
    }

    public PreorderTreeNode(T value, Node leftChild, Node rightChild) {
        super(value, leftChild, rightChild);
    }

    @Override
    public T search(K key) throws Exception {
        if(this.value.equals(key))
            return this.value;

        if(this.leftChild != null) {
            try {
                return (T)this.leftChild.search(key);
            } catch(Exception e) {}
        }

        if(this.rightChild != null) {
            try {
                return (T)this.rightChild.search(key);
            } catch(Exception e) {}
        }

        throw new Exception("Not Found");
    }

    @Override
    public void getList(List<T> list) {
        list.add(this.value);

        if(this.leftChild != null)
            this.leftChild.getList(list);

        if(this.rightChild != null)
            this.rightChild.getList(list);
    }

    @Override
    public void add(Node node) {

    }

    @Override
    public void remove(K key) {

    }
}
