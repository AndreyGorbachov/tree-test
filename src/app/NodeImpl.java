package app;

import java.util.ArrayList;
import java.util.List;


/**
 * Тестовая реализация узла дерева
 * 
 * @author Kalitko.Evgeny
 *
 */
public class NodeImpl implements Node {

	private final Node parent;
	private final List<Node> children = new ArrayList<>();

	private NodeImpl() {
		this.parent = null;
	}
	
	private NodeImpl(Node parent) {
		if(parent == null) {
			throw new IllegalArgumentException("Incorrent API usage: parent can't be null!");
		}
		this.parent = parent;
		parent.getChildren().add(this);
	}

	@Override
	public Node getParent() {
		return parent;
	}

	@Override
	public List<Node> getChildren() {
		return children;
	}
	
	/**
	 * @return тестовый набор данных
	 */
	public static Node testCase01() {
		NodeImpl root = new NodeImpl();
		NodeImpl ch1 = new NodeImpl(root);
		NodeImpl ch2 = new NodeImpl(root);
		new NodeImpl(ch1);
		new NodeImpl(ch1);
		NodeImpl ch21 = new NodeImpl(ch2);
		NodeImpl ch211 = new NodeImpl(ch21);
		NodeImpl ch212 = new NodeImpl(ch21);
		new NodeImpl(ch212);
		new NodeImpl(new NodeImpl(ch212));
		return ch211;
	}

}