package sjb.timecomplexity;

public class Binarysearchtree {
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
			node.left=insertNode(node,value);
		}
		else if(value>node.data) {
			node.right=insertNode(node,value);
		}
		return node;
	}
	void inorder() {
		inorder(root);
	}
	void inorder(TreeNode node) {
		if(node!=null) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
