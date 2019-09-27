public class List{
	public static void main(String []args){
		ListElement le = new ListElement();
		ListElement le2 = new ListElement();
		ListElement le3 = new ListElement();
		le.setData(5);
		le2.setData(6);
		le3.setData(7);
		le.addElement(le2);
		le2.addElement(le3);
		System.out.println("The list show from head: ");
		le.printLinkedListHead();
		System.out.println("\n The list show from tail: ");
		le.printLinkedListTail();
		
		ListElement le4 = new ListElement();
		le4 = le.getElement(1);
		System.out.println("\nindex = 1, the element's data is " + le4.getData());
		le = le.deleteElement(1);
		System.out.println("delecte element which index = 1, show list from head: ");	
		le.printLinkedListHead();		
	}
}