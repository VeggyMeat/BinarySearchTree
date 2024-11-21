import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeNodeTest {
    @Test
    void testConstructor() {
        BinaryTreeNode node = new BinaryTreeNode(5);
        assertNotNull(node);
    }

    @Test
    void testGetValue() {
        BinaryTreeNode node = new BinaryTreeNode(5);
        assertEquals(5, node.getValue());
    }

    @Test
    void testSetValue() {
        BinaryTreeNode node = new BinaryTreeNode(5);
        node.setValue(7);
        assertEquals(7, node.getValue());
    }

    @Test
    void testGetLeftEmpty() {
        BinaryTreeNode node = new BinaryTreeNode(5);
        assertNull(node.getLeft());
    }

    @Test
    void testGetRightEmpty() {
        BinaryTreeNode node = new BinaryTreeNode(5);
        assertNull(node.getRight());
    }

    @Test
    void testSetLeft() {
        BinaryTreeNode node = new BinaryTreeNode(5);
        BinaryTreeNode left = new BinaryTreeNode(3);
        node.setLeft(left);
        assertEquals(left, node.getLeft());
    }

    @Test
    void testSetRight() {
        BinaryTreeNode node = new BinaryTreeNode(5);
        BinaryTreeNode right = new BinaryTreeNode(7);
        node.setRight(right);
        assertEquals(right, node.getRight());
    }

    @Test
    void testGetLeft() {
        BinaryTreeNode node = new BinaryTreeNode(5);
        BinaryTreeNode left = new BinaryTreeNode(3);
        node.setLeft(left);
        assertEquals(left, node.getLeft());
    }

    @Test
    void testGetRight() {
        BinaryTreeNode node = new BinaryTreeNode(5);
        BinaryTreeNode right = new BinaryTreeNode(7);
        node.setRight(right);
        assertEquals(right, node.getRight());
    }
}