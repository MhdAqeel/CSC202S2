public class ArrayBinaryTree {
    private Character[] tree;
    private int capacity;

    public ArrayBinaryTree(int capacity) {
        this.capacity = capacity;
        this.tree = new Character[capacity];
    }

    // Helper: Find index of a given character
    public int findIndex(char val) {
        for (int i = 0; i < capacity; i++) {
            if (tree[i] != null && tree[i] == val) {
                return i;
            }
        }
        return -1;
    }

    // 1. Get children of a node
    public void getChildren(char val) {
        int idx = findIndex(val);
        if (idx == -1) {
            System.out.println("Node '" + val + "' not found.");
            return;
        }

        int leftIdx = 2 * idx + 1;
        int rightIdx = 2 * idx + 2;

        Character left = (leftIdx < capacity) ? tree[leftIdx] : null;
        Character right = (rightIdx < capacity) ? tree[rightIdx] : null;

        System.out.println("Children of '" + val + "': Left = " 
            + (left != null ? left : "None") 
            + ", Right = " + (right != null ? right : "None"));
    }

    // 2. Get parent of a node
    public Character getParent(char val) {
        int idx = findIndex(val);
        if (idx <= 0) return null; // Root or not found
        return tree[(idx - 1) / 2];
    }

    // 3. Set right child of a node
    public void setRightChild(char parentVal, char childVal) {
        int idx = findIndex(parentVal);
        if (idx != -1) {
            int rightIdx = 2 * idx + 2;
            if (rightIdx < capacity) {
                tree[rightIdx] = childVal;
            }
        }
    }

    // 4. Set parent of a node
    public void setParent(char childVal, char newParentVal) {
        int idx = findIndex(childVal);
        if (idx > 0) {
            int parentIdx = (idx - 1) / 2;
            tree[parentIdx] = newParentVal;
        }
    }

    // 5. Find height (measured by edges)
    public int getHeight() {
        return calculateHeight(0);
    }

    private int calculateHeight(int index) {
        if (index >= capacity || tree[index] == null) return -1;
        int leftH = calculateHeight(2 * index + 1);
        int rightH = calculateHeight(2 * index + 2);
        return 1 + Math.max(leftH, rightH);
    }

    // 6. Find total size (non-null nodes)
    public int getSize() {
        int count = 0;
        for (int i = 0; i < capacity; i++) {
            if (tree[i] != null) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayBinaryTree bt = new ArrayBinaryTree(32);

        // Build the initial tree according to the diagram
        bt.tree[0] = 'b';
        bt.tree[1] = 'i';
        bt.tree[2] = 'n';
        bt.tree[4] = 'a';
        bt.tree[5] = 'r';
        bt.tree[10] = 'y';

        // 1. Get children of 'y'
        bt.getChildren('y');

        // 2. Get parent of 'r'
        System.out.println("Parent of 'r': " + bt.getParent('r'));

        // Initial tree metrics
        System.out.println("Tree Height: " + bt.getHeight() + " edges (" + (bt.getHeight() + 1) + " levels)");
        System.out.println("Initial Tree Size: " + bt.getSize());

        // 3. Set right child of 'n' as 'o'
        bt.setRightChild('n', 'o');
        System.out.println("Set right child of 'n' as 'o'.");

        // 4. Set parent of 'y' as 'g'
        bt.setParent('y', 'g');
        System.out.println("Set parent of 'y' as 'g' (replaced 'a').");

        // Metrics after modifications
        System.out.println("Updated Tree Size: " + bt.getSize());
    }
}