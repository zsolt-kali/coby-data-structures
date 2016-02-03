package io.coby.data.structures;

/**
 * Created by kalizsolt on 31/01/16.
 */
public class BinarySearchTree {
    private BinaryTreeNode rootNode;

    public BinaryTreeNode insert(int valueToInsert) {
        if (rootNode == null) {
            return rootNode = new BinaryTreeNode(valueToInsert);
        } else {
            return insertNode(rootNode, valueToInsert);
        }
    }

    private BinaryTreeNode insertNode(BinaryTreeNode rootNode, int valueToInsert) {
        if (valueToInsert <= rootNode.data) {
            if (rootNode.leftChild == null) {
                return rootNode.leftChild = new BinaryTreeNode(valueToInsert);
            } else {
                return insertNode(rootNode.leftChild, valueToInsert);
            }
        } else {
            if (rootNode.rightChild == null) {
                return rootNode.rightChild = new BinaryTreeNode(valueToInsert);
            } else {
                return insertNode(rootNode.rightChild, valueToInsert);
            }
        }
    }


    public boolean search(int nodeValueToSearch) {
        if (rootNode == null) {
            return false;
        }

        return searchNode(rootNode, nodeValueToSearch);
    }

    private boolean searchNode(BinaryTreeNode rootNode, int nodeValueToSearch) {
        if (rootNode.data == nodeValueToSearch) {
            return true;
        }
        if (nodeValueToSearch <= rootNode.data && rootNode.leftChild != null) {
            return searchNode(rootNode.leftChild, nodeValueToSearch);
        }
        if (nodeValueToSearch > rootNode.data && rootNode.rightChild != null) {
            return searchNode(rootNode.rightChild, nodeValueToSearch);
        }
        return false;
    }

    public int findMin() {
        if (rootNode == null) {
            throw new IllegalArgumentException("The binary search tree is empty");
        }
        return findMin(rootNode);
    }

    private int findMin(BinaryTreeNode rootNode) {
        if (rootNode.leftChild != null) {
            return findMin(rootNode.leftChild);
        }
        return rootNode.data;
    }


    public int findMax() {
        if (rootNode == null) {
            throw new IllegalArgumentException("The binary search tree is empty");
        }
        return findMax(rootNode);
    }

    private int findMax(BinaryTreeNode rootNode) {
        if (rootNode.rightChild != null) {
            return findMax(rootNode.rightChild);
        }
        return rootNode.data;
    }

    public int findHeight() {
        if (rootNode == null) {
            throw new IllegalArgumentException("The binary search tree is empty");
        }
        return findHeight(rootNode);
    }


    private int findHeight(BinaryTreeNode rootNode) {
        if (rootNode == null) {
            return -1;
        }

        int leftHeight = findHeight(rootNode.leftChild);
        int rightHeight = findHeight(rootNode.rightChild);

        if (leftHeight > rightHeight)
            return leftHeight + 1;
        else
            return rightHeight + 1;
    }
}
