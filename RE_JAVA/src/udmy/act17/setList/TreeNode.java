package udmy.act17.setList;

public class TreeNode {
	/* 
	 * Node Tree ��ȸ ����.
	 * ��ó:  https://readerr.tistory.com/35
	 * 
	 */
	
	
	// state
	int count;
	
	public TreeNode() {
		count = 0;
	}
	
	public class Node{
		Object data;
		Node left;
		Node right;
		
		// ���� �� �Ű������� �޾� �ʱ�ȭ�ϴ� ������θ� ���� ����
		public Node(Object data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
}
