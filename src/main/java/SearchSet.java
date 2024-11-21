public class SearchSet {
    private int mElements;
    private BinaryTreeNode mHead;

    public SearchSet() {
        mElements = 0;
        mHead = null;
    }

    public void insert(int element) {
        if (mHead == null) {
            mHead = new BinaryTreeNode(element);
        }
        else {
            // start at the head
            BinaryTreeNode current = mHead;
            while (true) {
                // get the value of the current node
                int value = current.getValue();

                // if we find the value already, throw an exception, as there cannot be duplicates
                if (element == value) {
                    throw new IllegalArgumentException("Element already exists in set");
                }

                // if the element is greater than the value, go right
                if (element > value) {
                    BinaryTreeNode right = current.getRight();

                    // if there is no tree to the right, add the element there
                    if (right == null) {
                        current.setRight(new BinaryTreeNode(element));
                        break;
                    }

                    // otherwise, go right
                    current = right;
                }

                // if the element is less than the value, go left
                else {
                    BinaryTreeNode left = current.getLeft();

                    // if there is no tree to the left, add the element there
                    if (left == null) {
                        current.setLeft(new BinaryTreeNode(element));
                        break;
                    }

                    // otherwise, go left
                    current = left;
                }
            }
        }

        mElements++;
    }

    public int getNumberElements() {
        return mElements;
    }

    public boolean contains(int element) {
        // start at the head
        BinaryTreeNode current = mHead;

        while (current != null) {
            // if we find the element, return true
            if (current.getValue() == element) {
                return true;
            }

            // if the element is less than the current value, go left
            else if (element < current.getValue()) {
                current = current.getLeft();
            }
            // otherwise, go right
            else {
                current = current.getRight();
            }
        }

        // if we reach the end of the tree, return false
        return false;
    }

    public static void main(String[] args) {

    }
}
