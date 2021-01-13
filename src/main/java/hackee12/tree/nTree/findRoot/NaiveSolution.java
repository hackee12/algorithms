package hackee12.tree.nTree.findRoot;

import hackee12.tree.nTree.Node;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NaiveSolution implements Solution {

    @Override
    public Node findRoot(List<Node> tree) {
        int maxDepth = 0;
        Node root = null;
        for (Node n : tree) {
            int m = maxDepth(n);
            if (m > maxDepth) {
                maxDepth = m;
                root = n;
            }
        }
        return root;
    }

    private int maxDepth(Node root) {
        if (root == null) return 0;
        if (knownDepths.containsKey(root)) return knownDepths.get(root);
        if (root.children.isEmpty()) {
            knownDepths.put(root, 1);
            return 1;
        }
        int maxDepth = 0;
        for (Node ch : root.children) {
            maxDepth = Math.max(maxDepth, maxDepth(ch));
        }
        knownDepths.put(root, maxDepth + 1);
        return maxDepth + 1;
    }

    private final Map<Node, Integer> knownDepths = new HashMap<>();
}
