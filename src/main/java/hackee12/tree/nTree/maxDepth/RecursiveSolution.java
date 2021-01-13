package hackee12.tree.nTree.maxDepth;

import hackee12.tree.nTree.Node;

public class RecursiveSolution implements Solution {

    @Override
    public int maxDepth(Node root) {
        if (root == null) return 0;
        if (root.children == null || root.children.isEmpty()) return 1;
        int maxDepth = 0;
        for (Node ch : root.children) {
            maxDepth = Math.max(maxDepth(ch), maxDepth);
        }
        return maxDepth + 1;
    }
}

