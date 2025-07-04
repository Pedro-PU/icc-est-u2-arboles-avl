public class Node {
    private int key;
    private int height;
    private Node left;
    private Node right;

    public Node(int key) {
        this.key = key;
        this.height = 1; 
    }

    public int getKey() {
        return key; 
    }
    public int getHeight() { 
        return height; 
    }
    public void setHeight(int height) { 
        this.height = height; 
    }
    public Node getLeft() { 
        return left; 
    }
    public void setLeft(Node left) { 
        this.left = left; 
    }
    public Node getRight() { 
        return right; 
    }
    public void setRight(Node right) { 
        this.right = right; 
    }
}
