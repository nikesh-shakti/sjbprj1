package sjb.timecomplexity;

public class Binary {
	TreeNode root;
	void insert(int value) {
		root=insertNode(root,value);
	}
	TreeNode insertNode(TreeNode node,int value) {
		if(node==null)
		{
			node=new TreeNode(value);
			return node;
		}
		if(value<node.data) {
			node.left=insertNode(node.left,value);
		}
		else if(value>node.data) {
			node.right=insertNode(node.right,value);
		}
		return node;
	}
	void inorder() {
		System.out.println("inorder");
		inorder(root);
	}
	void inorder(TreeNode node) {
		if(node!=null) {
			inorder(node.left);
			System.out.println(node.data);
			inorder(node.right);
		}
	}
	void preorder() {
		System.out.println("preorder");
		preorder(root);
	}
	void preorder(TreeNode node) {
		if(node!=null) {
			System.out.println(node.data);
			preorder(node.left);
			preorder(node.right);
		}
	}
	void postorder() {
		System.out.println("postorder");
		postorder(root);
	}
	void postorder(TreeNode node) {
		if(node!=null) {
			postorder(node.left);
			postorder(node.right);
			System.out.println(node.data);
		}
	}
	
	public static void main(String[] args) {
		Binary bst=new Binary();
		bst.insert(10);
		bst.insert(40);
		bst.insert(5);
		bst.insert(3);
		bst.insert(30);
		bst.insert(41);
		bst.insert(7);
		bst.inorder();
		bst.preorder();
		bst.postorder();

	}
}
