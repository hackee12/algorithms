package hackee12.tree.nTree.maxDepth;

import hackee12.Pair;
import hackee12.tree.nTree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class ProvidedIterativeSolution implements Solution {

    @Override
    public int maxDepth(Node root) {
        Queue<Pair<Node, Integer>> stack = new LinkedList<>();
        if (root != null) {
            stack.add(new Pair<>(root, 1));
        }

        int depth = 0;
        while (!stack.isEmpty()) {
            Pair<Node, Integer> current = stack.poll();
            root = current.fst;
            int current_depth = current.snd;
            if (root != null) {
                depth = Math.max(depth, current_depth);
                for (Node c : root.children) {
                    stack.add(new Pair<>(c, current_depth + 1));
                }
            }
        }
        return depth;
    }
}
