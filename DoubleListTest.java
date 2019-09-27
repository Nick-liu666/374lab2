public class List{
	public static void main(String []args){
		DoubleListElement le = new DoubleListElement();
		DoubleListElement le2 = new DoubleListElement();
		le.setData(5);
		le2.setData(6);
		le.addElement(le2);
		le.printLinkedListTail();
		le.printLinkedListHead();
	}
}