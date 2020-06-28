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
        node n = new node(i);
        if(root==null){
            root=n;
        }
      
    }
    
}

class treed{
    public static void main(String[] args){
        tree t = new tree();
        t.insert(3);
        System.out.println(t.root.data);
    }
}