package Problem2;
//https://www.geeksforgeeks.org/lowest-common-ancestor-in-a-binary-search-tree/#:~:text=The%20lowest%20common%20ancestor%20between,be%20a%20descendant%20of%20itself).

import Problem1.TreeNode;

public class LCA {
    public static TreeNode<Integer> lowestCommonAncestor(TreeNode<Integer> root, TreeNode<Integer> p, TreeNode<Integer> q) {
        TreeNode<Integer> current = root;

        if(root == null) {
            return null;
        }

        if(root == p || root == q) {
            return root;
        }

     //   if((current < p) && (current < q) {
     //       return lowestCommonAncestor(root, p,q);
     //   }


        return null;
    }
}
