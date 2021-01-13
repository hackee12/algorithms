package hackee12.tree.nTree.findRoot;

import hackee12.tree.nTree.Node;

import java.util.List;

public class ProvidedConstantSpaceSolution {
    public Node findRoot(List<Node> tree) {

        int valueSum = 0;

        for (Node node : tree) {
            // the value is added as a parent node
            valueSum += node.val;
            for (Node child : node.children)
                // the value is deducted as a child node.
                valueSum -= child.val;
        }

        Node root = null;
        // the value of the root node is `valueSum`
        for (Node node : tree) {
            if (node.val == valueSum) {
                root = node;
                break;
            }
        }
        return root;
    }
}
