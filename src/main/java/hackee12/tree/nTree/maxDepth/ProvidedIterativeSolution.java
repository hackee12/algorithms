package hackee12.tree.nTree.maxDepth;

import hackee12.tree.nTree.Node;
import jdk.internal.vm.compiler.collections.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class ProvidedIterativeSolution implements Solution {

    @Override
    public int maxDepth(Node root) {
        Queue<Pair<Node, Integer>> stack = new LinkedList<>();
        if (root != null) {
            stack.add(Pair.create(root, 1));
        }

        int depth = 0;
        while (!stack.isEmpty()) {
            Pair<Node, Integer> current = stack.poll();
            root = current.getLeft();
            int current_depth = current.getRight();
            if (root != null) {
                depth = Math.max(depth, current_depth);
                for (Node c : root.children) {
                    stack.add(Pair.create(c, current_depth + 1));
                }
            }
        }
        return depth;
    }
}
