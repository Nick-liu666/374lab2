public class DoubleListElement {
	public DoubleListElement next;
	public DoubleListElement previous;
	private int data;
	
	
	public DoubleListElement()
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
	
	public void addElement(DoubleListElement addElement)
	{
		this.next = addElement;
		addElement.previous = this;
	}
	public DoubleListElement getElement(int index)
	{
		assert(index >=0);
		DoubleListElement result = this;
		for(int i = 0; i < index; i++){
			result = result.next;
		}
		return result;
	}
	public DoubleListElement deleteElement(int index)
	{
		assert(index >=0);
		if(index == 0){
			if(this.next == null){
				this.data = 0;
			}
			else{
				this.data = this.next.data;
				this.next.next.previous = this;
				this.next = this.next.next;
			}
			return this;
		}
		DoubleListElement deleteElement = this;
		for(int i = 0; i < index; i++){
			deleteElement = deleteElement.next;
		}
		deleteElement.next.previous = deleteElement.previous;
		deleteElement.previous.next = deleteElement.next;
		return this;
	}
	public void printLinkedListTail()
	{
		printLinkedListTail_helper(this);
	}
	public void printLinkedListTail_helper(DoubleListElement element){
		if(element.next != null){
			printLinkedListTail_helper(element.next);
			System.out.println(element.data + " ");
		}
		else{
			System.out.println(element.data + " ");
		}
	}
	public void printLinkedListHead()
	{
		DoubleListElement result = this;
		while(result != null){
			System.out.println(result.getData() + " ");
			result = result.next;
		}
	}	
}