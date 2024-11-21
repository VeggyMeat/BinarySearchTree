import java.util.Queue;

public class FunctionalArray {
    public final int mSize;

    public final int DEFAULT_VALUE = 0;

    private BinaryTreeNode head;

    public FunctionalArray(int size) {
        mSize = size;

        // set up the functional tree
        createTree();
    }

    private void createTree() {
        // I got into a little bit of a rabbit hole, and should have just an easy depth first implementation

        class Pair {
            public final BinaryTreeNode node;
            public final boolean left;

            public Pair(BinaryTreeNode node, boolean left) {
                this.node = node;
                this.left = left;
            }
        }

        // if it's an array of size 0, return as it is already set up
        if (mSize == 0) {
            return;
        }

        // create the head of the tree
        head = new BinaryTreeNode(DEFAULT_VALUE);

        // create a new queue with our head in
        Queue<Pair> queue = new java.util.LinkedList<>();
        queue.add(new Pair(head, true));

        // set count to the number of nodes left to add
        int count = mSize - 1;

        while (count > 0) {
            // get the next pair
            Pair current = queue.poll();

            if (current.left) {
                // add the pair for the right set of this node to the queue
                queue.add(new Pair(current.node, false));

                // create the new left node
                BinaryTreeNode newNode = new BinaryTreeNode(DEFAULT_VALUE);
                current.node.setLeft(newNode);

                // add the pair for the left node to the queue
                queue.add(new Pair(newNode, true));
            }
            else {
                // create the new right node
                BinaryTreeNode newNode = new BinaryTreeNode(DEFAULT_VALUE);
                current.node.setRight(newNode);

                // add the pair for the right node to the queue
                queue.add(new Pair(newNode, true));
            }

            count--;
        }
    }

    public void set(int index, int value) {
        // convert to a typical functional array index
        int indexTrack = index + 1;

        // start at the head
        BinaryTreeNode current = head;
        while (current != null) {
            // if we are at the correct index, set the value
            if (indexTrack == 1) {
                current.setValue(value);
                return;
            }

            // if the index is even, go left
            if (indexTrack % 2 == 0) {
                current = current.getLeft();
            }

            // if the index is odd, go right
            else {
                current = current.getRight();
            }

            // divide by two to get to the next level
            indexTrack /= 2;
        }

        throw new IndexOutOfBoundsException("Index out of bounds");
    }

    public int get(int index) {
        // convert to a typical functional array index
        int indexTrack = index + 1;

        // start at the head
        BinaryTreeNode current = head;
        while (current != null) {
            // if we are at the correct index, return the value
            if (indexTrack == 1) {
                return current.getValue();
            }

            // if the index is even, go left
            if (indexTrack % 2 == 0) {
                current = current.getLeft();
            }

            // if the index is odd, go right
            else {
                current = current.getRight();
            }

            // divide by two to get to the next level
            indexTrack /= 2;
        }

        throw new IndexOutOfBoundsException("Index out of bounds");
    }
}
