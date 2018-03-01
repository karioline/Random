// CMPS390// BinarySearchTreeDriver.java// Kuo-pao Yang/* s = {"D", "F", "I", "C", "H", "A", "E", "J", "B", "G"};          D       /     \      C       F     /       /  \    A       E     I     \           / \      B         H   J               /              G   Preorder traversal is    D C A B F E I H G J    Postorder traversal is    B A C E G H J I F D    Inorder traversal is    A B C D E F G H I J    Level order traversal is    D C F A E I B H J G */public class BinarySearchTreeDriver {	public static void main(String[] args) {		BinarySearchTree aTree = createTree();		testTreeOperations(aTree);		testSearchTreeOperations(aTree);	}  // end main	public static BinarySearchTree createTree() {		System.out.println("\nCreating a binary search tree:");		BinarySearchTree aTree = new BinarySearchTree();		System.out.println("\nTesting isEmpty() returns " + aTree.isEmpty() + " (should be true)");      String[] s = {"D", "F", "I", "C", "H", "A", "E", "J", "B", "G"};		System.out.println("\nTesting add()");      for (int i=0; i < s.length; i++) {         System.out.print(s[i] + " ");         aTree.add(s[i]);      }		System.out.print("\nThe tree contains " + aTree.getNumberOfNodes() + " (should be 10 items)");		traverse(aTree);     		return aTree;	} // end createTree	public static void traverse(BinarySearchTree bst) {	  System.out.println("\nPreorder traversal is ");     bst.preorder(bst.getRootNode());	  System.out.println("\nPostorder traversal is ");     bst.postorder(bst.getRootNode());	  System.out.println("\nInorder traversal is ");     bst.inorder(bst.getRootNode());	  System.out.println("\nLevel order traversal is ");     bst.levelorder(bst.getRootNode()); 	} // end traverse	public static void testTreeOperations(BinarySearchTree aTree)	{ 		// display root, height, number of nodes      System.out.println("\n\nTesting getRootData(), getHeight(), getNumberOfNodes()");		System.out.println("Root of tree is " + aTree.getRootData() + " (should be D)");		System.out.println("Height of tree is " + aTree.getHeight() + " (should be 5)");		System.out.println("Tree has " + aTree.getNumberOfNodes() + " nodes (should be 10)");	} // end testTreeOperations		public static void testSearchTreeOperations(BinarySearchTree aTree) {	   // test getEntry			System.out.println("\nTesting getEntry(): ");		System.out.println("Getting A: " + aTree.getEntry("A") + " (should be A)");		System.out.println("Getting G: " + aTree.getEntry("G") + " (should be G)");		System.out.println("Getting S: " + aTree.getEntry("S") + " (should be null)");	   // test contains		System.out.println("\nTesting contains(): ");      System.out.println("B is in tree = " +  aTree.contains("B") + " (should be true)");      System.out.println("C is in tree = " +  aTree.contains("C") + " (should be true)");      System.out.println("T is in tree = " +  aTree.contains("T") + " (should be false)"); 		// test remove		System.out.println("\nTesting remove(): ");		System.out.println("Removing G: " + aTree.remove("G") + " (should be G)");    // leaf		System.out.println("Removing C: " + aTree.remove("C") + " (should be C)");    // one child		System.out.println("Removing I: " + aTree.remove("I") + " (should be I)");    // two children		System.out.println("Removing D: " + aTree.remove("D") + " (should be D)");    // two children		System.out.println("Removing T: " + aTree.remove("T") + " (should be null)"); // missing		System.out.print("\nThe tree contains " + aTree.getNumberOfNodes() + " (should be 6) items");		traverse(aTree);	} // end testSearchTreeOperations}  // end Driver