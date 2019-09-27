public class ListElement {
	public ListElement next;
	private int data;
	
	
	public ListElement()
	{
		this.next = null;
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
			this.data = this.next.data;
			this.next = this.next.next;
			return this;
		}
		if(index == 0 && this.next == null){
			this.data = 0;
			return this;
		}
		ListElement frontElement = this;
		ListElement backElement = this;
		for(int i = 0; i < index; i++){
			frontElement = backElement;
			backElement = backElement.next;
		}
		frontElement.next = backElement.next;
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
		System.out.println(this.data);
	}	
}