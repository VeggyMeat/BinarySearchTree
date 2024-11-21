public class BinaryTreeNode {
    private int mElement;
    private BinaryTreeNode mLeft;
    private BinaryTreeNode mRight;

    public BinaryTreeNode(int element) {
        mElement = element;
    }

    public int getValue() {
        return mElement;
    }

    public void setValue(int value) {
        mElement = value;
    }

    public BinaryTreeNode getLeft() {
        if (mLeft == null) {
            return null;
        }
        return mLeft;
    }

    public BinaryTreeNode getRight() {
        if (mRight == null) {
            return null;
        }
        return mRight;
    }

    public void setRight(BinaryTreeNode right) {
        mRight = right;
    }

    public void setLeft(BinaryTreeNode left) {
        mLeft = left;
    }
}