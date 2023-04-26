package tree;
import java.util.*;
class TreeDemo
{
	void preOrder(Node node)
	{
		if(node==null)
		{
			return;
		}
		System.out.print(" "+node.data);
		//towards left(till last)
		preOrder(node.left);
		//right
		preOrder(node.right);
		
	}
}
public class TreeRecursion {

}
