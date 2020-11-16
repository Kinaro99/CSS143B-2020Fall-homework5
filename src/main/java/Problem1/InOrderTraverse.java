package Problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraverse {
    public static List<Integer> inorderTraversalIterative(TreeNode<Integer> root) {

        List<Integer> result = new ArrayList<>();

        Stack<TreeNode<Integer>> stack = new Stack<>();
        TreeNode<Integer> current = root;

        if(root == null){
            return result;
        }

        while(current != null || !stack.empty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                current = stack.pop();
                result.add(current.val);
                current = current.right;
            }
        }
        return result;
    }

}

//unwrap if statement..?
