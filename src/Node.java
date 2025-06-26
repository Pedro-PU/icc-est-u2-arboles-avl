
public class Node {

    private int key;
    private Node left;
    private Node right;
    private int height;

    public Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
    public int getKey() {
        return key;
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
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

}
