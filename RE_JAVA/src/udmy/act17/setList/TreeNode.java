package udmy.act17.setList;

public class TreeNode {
	/* 
	 * Node Tree 순회 구현.
	 * 출처:  https://readerr.tistory.com/35
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
		
		// 생성 시 매개변수를 받아 초기화하는 방법으로만 선언 가능
		public Node(Object data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
}
