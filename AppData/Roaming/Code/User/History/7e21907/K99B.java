public class bt {
    static class node{
        int data;
        node left;
        node right;

    
    node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }


    }
    static class binarytree{
        static int index=-1;
        public static node  tree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }
            node newnode =new node(nodes[index]);
            newnode.left=tree(nodes);
        }
    }
    public static void main(Strings[] args){
        int nodes[]={1,3,5,-1,-1,4,5,6,-1,-1,4}
        binarytree tree=new binarytree();
        node root=tree 
    }
}
