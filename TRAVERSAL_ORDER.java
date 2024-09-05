
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class TRAVERSAL_ORDER {
    public static void preOrder(TreeNode root){
        if(root!=null){
            System.out.println(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void postOrder(TreeNode root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.val+" ");
        }
    }
    public static void inOrder(TreeNode root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.val+" ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);

        System.out.println("Preorder traversal:");
        preOrder(root);
        System.out.println("Postorder traversal:");
        postOrder(root);
        System.out.println("Inorder traversa:");
        inOrder(root);
    }
}
