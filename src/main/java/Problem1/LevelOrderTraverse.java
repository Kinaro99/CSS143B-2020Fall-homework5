package Problem1; //not done
//https://www.youtube.com/watch?v=9PHkM0Jri_4 -> Used this to understand queue use in problem and way to follow code
//https://www.geeksforgeeks.org/level-order-tree-traversal/
import java.util.*;

public class LevelOrderTraverse {
    public static List<List<Integer>> levelOrder(TreeNode<Integer> root) {

        List<List<Integer>> result = new ArrayList<>();

        Queue<TreeNode<Integer>> queue = new LinkedList<>(); // Linked list used because it's faster to add/remove and unlimited items didn't use arraylist because didn't need to access random elements
        TreeNode<Integer> current;

        List<Integer> tempList = new ArrayList<>();

        if(root == null){
            return result;
        }

        queue.add(root);
        while (!queue.isEmpty()) {
            current = queue.poll(); //poll -> remove head

            if (current == null) {
                result.add(tempList);
            } else {
                if (current.right != null) {
                    queue.add(current.right);
                }
                if (current.left != null) {
                    queue.add(current.left);
                }
            }
            tempList.add(current.val);
            result.add(tempList);
        }
        return result;
    }
}
