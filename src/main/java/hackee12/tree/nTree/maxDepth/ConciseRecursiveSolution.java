package hackee12.tree.nTree.maxDepth;

import hackee12.tree.nTree.Node;

public class ConciseRecursiveSolution implements Solution {

    @Override
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int cur = 0;
        for (Node node : root.children) {
            cur = Math.max(cur, maxDepth(node));
        }
        return 1 + cur;
    }
}
