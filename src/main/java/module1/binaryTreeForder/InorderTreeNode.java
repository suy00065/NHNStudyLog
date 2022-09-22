package module1.binaryTreeForder;

import java.util.List;

public class InorderTreeNode<T, K> extends Node<T, K> {
    public InorderTreeNode(T value) {
        super(value, null, null);
    }

    public InorderTreeNode(T value, Node leftChild) {
        super(value, leftChild, null);
    }

    public InorderTreeNode(T value, Node leftChild, Node rightChild) {
        super(value, leftChild, rightChild);
    }

    @Override
    public T search(K key) throws Exception {
        if(this.leftChild != null) {
            try {
                return (T)this.leftChild.search(key);
            } catch (Exception e) {}
        }

        if(this.value.equals(key)) {
            return this.value;
        }

        if(this.leftChild != null) {
            try {
                return (T)this.rightChild.search(key);
            } catch(Exception e) {}
        }

        throw new Exception("Not found");
    }

    @Override
    public void getList(List<T> list) {
        if(this.leftChild != null)
            this.leftChild.getList(list);

        list.add(this.value);

        if(this.rightChild!= null)
            this.rightChild.getList(list);
    }

    @Override
    public void add(Node node) {
        if((int)this.value > (int)node.getValue()) {
            if(this.leftChild != null) {
                ((InorderTreeNode)this.leftChild).add(node);
            } else {
                this.leftChild = node;
            }
        } else {
            if(this.rightChild != null) {
                ((InorderTreeNode)this.leftChild).add(node);
            } else {
                this.rightChild = node;
            }
        }
    }

    public void add(K value) {
        if((int)this.value > (int)value) {
            if(this.leftChild != null) {
                ((InorderTreeNode)this.leftChild).add(value);
            } else {
                this.leftChild = new InorderTreeNode(value);
            }
        } else {
            if(this.rightChild != null) {
                ((InorderTreeNode)this.rightChild).add(value);
            } else {
                this.rightChild = new InorderTreeNode(value);
            }
        }
    }

    public void remove(K key) {

    }

}
