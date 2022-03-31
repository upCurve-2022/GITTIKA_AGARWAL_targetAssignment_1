package javaChallenges;


import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class program17 {
    static class TreeNode {
        int data;
        TreeNode lchild;
        TreeNode rchild;

        public TreeNode(int value) {
            this.data = value;
            this.lchild = null;
            this.rchild = null;

        }
    }
//static  public class JavaTree{
//           TreeNode root;
//
//
//
//}

   public static void insert(TreeNode root, int i) {
        if(i<root.data){
            if(root.lchild!=null) {
                insert(root.lchild, i);
            }else{
                root.lchild=new TreeNode(i);
            }
        }else if(i>root.data){
            if(root.rchild!=null){
                insert(root.rchild,i);
            }else{
                root.rchild=new TreeNode(i);
            }
        }
    }
    public static void main(String[] args) {
//      JavaTree tree= new JavaTree();
      TreeNode root=new TreeNode(100);
      insert(root,90);
      insert(root,190);
      insert(root,12);
      insert(root,38);
      insert(root,50);
      insert(root,20);
      insert(root,5);
      insert(root,145);
      insert(root,200);
//      tree.root.lchild=new TreeNode(50);
//      tree.root.rchild=new TreeNode(120);
//      tree.root.lchild.lchild=new TreeNode(20);
//      tree.root.lchild.rchild=new TreeNode(60);
//      tree.root.rchild.rchild=new TreeNode(140);
//      tree.root.rchild.rchild.lchild=new TreeNode(125);
        ArrayList<Integer> list=new ArrayList<>();
        leaf(root,list);
        System.out.println("The leave node of given tree are:"+list);

    }



    private static void leaf(TreeNode root,ArrayList<Integer> list) {

        if(root==null){
            return;
        }
        if(root.lchild==null && root.rchild==null){
            list.add(root.data);
        }
        leaf(root.lchild,list);
        leaf(root.rchild,list);
        return ;
    }
}
