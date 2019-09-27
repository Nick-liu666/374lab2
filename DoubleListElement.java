public class DoubleListElement {
	public ListElement next;
	public ListElement previous;
	private int data;
	
	
	public ListElement()
	{
		this.next = null;
		this.previous =null;
		this.data = 0;
	}
	
	
	public void setData(int data)
	{
		this.data = data;
	}

	
	public int getData()
	{
		return this.data;
	}
	
	public void addElement(ListElement addElement)
	{
		this.next = addElement;
		addElement.previous = this;
	}
	public ListElement getElement(int index)
	{
		assert(index >=0);
		ListElement result = this;
		for(int i = 0; i < index; i++){
			result = result.next;
		}
		return result;
	}
	public ListElement deleteElement(int index)
	{
		assert(index >=0);
		if(index == 0 && this.next != null){
			this.previous.next = this.next;
			this.next.previous = this.previous;
			return this;
		}
		ListElement deleteElement = this;
		for(int i = 0; i < index; i++){
			deleteElement = deleteElement.next;
		}
		deleteElement.previous.next = deleteElement.next;
		deleteElement.next.previous = deleteElement.previous;
		return this;
	}
	public void printLinkedListTail()
	{
		ListElement result = this;
		while(result.next != null){
			result = result.next;
		}
		System.out.println(result.data);
	}
	public void printLinkedListHead()
	{
		ListElement result = this;
		while(result.previous != null){
			result = result.previous;
		}
		System.out.println(result.data);
	}	
}