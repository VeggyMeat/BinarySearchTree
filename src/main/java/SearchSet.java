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
            BinaryTreeNode current = mHead;
            while (true) {
                int value = current.getValue();
                if (element == value) {
                    throw new IllegalArgumentException("Element already exists in set");
                }
                if (element > value) {
                    BinaryTreeNode right = current.getRight();
                    if (right == null) {
                        current.setRight(new BinaryTreeNode(element));
                        break;
                    }
                    current = right;
                }
                if (element < value) {
                    BinaryTreeNode left = current.getLeft();
                    if (left == null) {
                        current.setLeft(new BinaryTreeNode(element));
                        break;
                    }
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
        BinaryTreeNode current = mHead;
        while (current != null) {
            if (current.getValue() == element) {
                return true;
            }
            else if (element < current.getValue()) {
                current = current.getLeft();
            }
            else {
                current = current.getRight();
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
