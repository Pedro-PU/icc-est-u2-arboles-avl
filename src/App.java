public class App {
    public static void main(String[] args) throws Exception {
        //Insertar nodo , 10 ,20 ,15
        System.out.println("Pedro Pesantez");
        System.out.println("Fernando Martinez");
        AVLTree avlTree = new AVLTree();
        avlTree.insert(10);
        avlTree.insert(20);
        avlTree.insert(15);
        System.out.println(avlTree);
    }
}
