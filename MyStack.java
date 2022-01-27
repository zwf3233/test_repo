
import java.util.ArrayList;
public class MyStack<E> 
{
	private ArrayList<E> stack;
	public MyStack()
	{
		stack = new ArrayList<E>();
	}
	

	public void push(E item)
	{
		stack.add(item);
	}
	

	public Object pop()
	{
		if (isEmpty() == false)
			return stack.remove(stack.size() - 1);
		else
			return null;
	}


	public boolean isEmpty()
	{
		if (stack.size() == 0)
			return true;
		else
			return false;	
	}
	
	public String show()
	{
		if (isEmpty() == false)
			return stack.toString();
		else
			return null;
	}
	
	public int getSize()
	{
		return stack.size();
	}
}