class tree{

    class node{
        node left,right;
        int data;
    
        public node(int i){
            data=i;
            left=null;
            right=null;
        }
    }
    node root;
    public tree(){
        root=null;
    }
    public void insert(int i){
        node n =new node(i);
        if(root==null){
            root=n;
        }
        else{
            node curr=root;
            node parent=null;
            while(curr!=null){
                parent=curr;
                if(i<=curr.data){
                    curr=curr.left;
                }
                else{
                    curr=curr.right;
                }
            }
            if(i<=parent.data){
                parent.left=n;
            }
            else{
                parent.right=n;
            }
        }
    }

    public static void main(String[] args){
        tree t =new tree();
        t.insert(3);
        t.insert(54);
        t.insert(45);
        t.insert(21);
        t.insert(39);
        t.insert(98);
        t.insert(2);
    }

}