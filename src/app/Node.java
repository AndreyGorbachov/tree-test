package app;

import java.util.List;

/**
 * Узел дерева
 * 
 * @author Kalitko.Evgeny
 *
 */
public interface Node {

	/**
	 * @return вышестоящий родительский узел, либо null - если узел является корнем дерева
	 */
	public Node getParent();

	/**
	 * @return список дочерних узлов или пустой список, если узел является конечным (листом дерева)
	 */
	public List<Node> getChildren();
}