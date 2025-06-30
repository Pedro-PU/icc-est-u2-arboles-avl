public class AVLTree {

    private Node root;

    public AVLTree() {
        root = null;
    }

      public int height(Node node){
        if(node == null){
        return 0;
        }
        return node.getHeight(); 
    }


    public int getBalance(Node node){
        if(node == null){
            return 0;
        }
        return height(node.getLeft()) - height(node.getRight());
    }

    public void insert(int value){
        System.out.println("Node a Insertar");
        root = insertRec(root,value);
    }

    private Node insertRec(Node node, int value){
        if(node==null){
            Node newNode = new Node(value);
            newNode.setHeight(1);
            System.out.println("Nodo insertado: " + newNode.getKey() + " balance al insertar" + " = " + getBalance(newNode));
            return newNode;
        }
        if (value < node.getKey()) {
            node.setLeft(insertRec(node.getLeft(), value));  
        } else if (value > node.getKey()) {
            node.setRight(insertRec(node.getRight(), value)); 
        }else{
            return node;
        }
        System.out.println("Node actual: " + node.getKey());
        //Actualiza la altura del nodo
        int altura = 1 + Math.max(height(node.getLeft()), height(node.getRight()));
        node.setHeight(altura);
        System.out.println("\tAltura del nodo " + " = " + node.getHeight());
        
        //Analozer N
        
        int balance = getBalance(node);
        System.out.println("\tBalance del nodo " + " = " + balance);
        
        // Rotación Izquierda-Izquierda (LL)
        if (balance > 1 && value < node.getLeft().getKey()) {
            System.out.println("Rotacion Derecha (LL)");
            return rotateRight(node);
        }

        // Rotación Derecha-Derecha (RR)
        if (balance < -1 && value > node.getRight().getKey()) {
            System.out.println("Rotacion Izquierda (RR)");
            return rotateLeft(node);
        }

        // Rotación Izquierda-Derecha (LR)
        if (balance > 1 && value > node.getLeft().getKey()) {
            System.out.println("Rotacion Izquierda-Derecha (LR)");
            node.setLeft(rotateLeft(node.getLeft()));
            return rotateRight(node);
        }

        // Rotación Derecha-Izquierda (RL)
        if (balance < -1 && value < node.getRight().getKey()) {
            System.out.println("Rotacion Derecha-Izquierda (RL)");
            node.setRight(rotateRight(node.getRight()));
            return rotateLeft(node);
        }
        return node;
    }

    private Node rotateRight(Node y) {
        Node x = y.getLeft();
        Node T2 = x.getRight();

        x.setRight(y);
        y.setLeft(T2);
        y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())) + 1);
        x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);

        return x;
    }

    private Node rotateLeft(Node x) {
        Node y = x.getRight();
        Node T2 = y.getLeft();

        y.setLeft(x);
        x.setRight(T2);
        x.setHeight(Math.max(height(x.getLeft()), height(x.getRight())) + 1);
        y.setHeight(Math.max(height(y.getLeft()), height(y.getRight())) + 1);

        return y;
    }

    
}