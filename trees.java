 class node{
      int data;
      node left;
      node right;

     public node(int i) {
         data = i;
         left = null;
         right = null;
     }
 }

 class tree {
     node root;

     public tree() {
         root = null;
     }

     public void insert(int i) {
         node n = new node(i);
         if (root == null) {
             root = n;
         } 
         else {
             node curr = root;
             node parent = null;
             while (curr != null) {
                 parent = curr;
                 if (i <= curr.data) {
                     curr = curr.left;
                 } else {
                     curr = curr.right;
                 }
             }
             if (i <= parent.data) {
                 parent.left = n;
             } else {
                 parent.right = n;
             }
        }
}
 
}


class trees{
    public static void main(String[] args){
        tree t = new tree();
    t.insert(34);
    t.insert(76);
    t.insert(72);
    t.insert(43);
    t.insert(98);
    t.insert(75);
    
    System.out.println(t.root.data);
    //System.out.println(t.root.data);
    //System.out.println(t.root.right.right.data);
    //System.out.println(t.root.right.left.data);
    //System.out.println(t.root.right.left.left.data);
       
    }
}