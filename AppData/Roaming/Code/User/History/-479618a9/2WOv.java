class bt{
    int data;
    bt left;
    bt right;
    bt(int data){
        this.data=data;
        this.left=null;
        this.right=null;

    }
}
public class countnodes{
      int countnode(bt root){
        if(root==null){
            return 0;
        }
        int lans=countnode(root.left);
        int rans=countnode(root.right);
        return 1+lans+rans;
      }
      public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

       
        bt root = new bt(1);
        root.left = new bt(2);
        root.right = new bt(3);
        root.left.left = new bt(4);
        root.left.right = new bt(5);

       
        System.out.println(tree.countnode(root));
    }
}
