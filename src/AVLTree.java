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
        
        if (balance > 1 && value < node.getLeft().getKey()) {
            // Rotación Izquierda - Izquierda
            System.out.println("Rotacion Derecha");
        }
        if(balance < -1 && value > node.getRight().getKey()){
            //Rotacion Derecha - Derecha
            System.out.println("Rotacion Izquierda");
        }
        if(balance > 1 && value > node.getLeft().getKey()){
            //Rotacion Izquierda Derecha
            System.out.println("Rotacion Izquierda Derecha");
        }
        if(balance < -1 && value < node.getRight().getKey()){
            //Rotacion Derecha Izquierda
            System.out.println("Rotacion Derecha Izquierda");
        }
        return node;
    }
    
}