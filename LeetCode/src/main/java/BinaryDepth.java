import java.util.ArrayList;
import java.util.List;

public class BinaryDepth {

    public int maxDepth(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        nodes.add(root.val);
        while(!nodes.isEmpty()){
            TreeNode node = root;
            if(node.left !=null){
                nodes.add(node.left.val);
            }else if(node.right!=null){
                nodes.add(node.right.val);
            }
        }




        return nodes.size();

    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1 , new TreeNode( 2) , new TreeNode( 3));

        BinaryDepth b = new BinaryDepth();

        System.out.println(b.maxDepth(root));
    }
}
