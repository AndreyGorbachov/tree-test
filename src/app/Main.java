package app;

import java.util.List;

/**
 * @author Kalitko.Evgeny
 *
 */
public class Main {

	public static void main(String[] args) {
		int maxTreeDepth = getMaxTreeDepth(NodeImpl.testCase01());
		System.out.println(maxTreeDepth);
	}

	public static int getMaxTreeDepth(Node arbitraryNode) {
		while(arbitraryNode.getParent() != null){
			arbitraryNode = arbitraryNode.getParent();
		}
		return getMaxDepth(arbitraryNode);
	}
	
	private int getMaxDepth(Node node){
		if (node.getChildren().size() > 0) {
			List<Node> children = node.getChildren();
			int maxTreeDepth = 0;
			int newTreeDepth = 0;
			for (int i = 0; i < children.size(); i++) {
				newTreeDepth = getMaxDepth(children.get(i));
				if (maxTreeDepth < newTreeDepth) {
					maxTreeDepth = newTreeDepth;
				}
			}
			return maxTreeDepth + 1;
		}
		return 0;
	}

}
