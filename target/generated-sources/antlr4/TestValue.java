
import core.TPLList;
import core.Value;

public class TestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TPLList elem1 = new TPLList();
		TPLList elem2 = new TPLList();
		Value val1 = new Value(new String("Holi"));
		Value val0 = new Value(new String("holi"));
		Value val2 = new Value(new String("Holi"));
			
		elem1.add(val0);
		elem1.add(val2);
		
		elem2.add(val1);
		elem2.add(val2);
		
		Value list1 = new Value(elem1);
		Value list2 = new Value(elem2);

		System.out.println(list1.equals(list2)+" "+list1.toString()+" "+list2.toString());
		list1.asList().remove(1);
		
		
		System.out.println(list1.equals(list2)+" "+list1.toString()+" "+list2.toString());
		list2.asList().remove(1);
		System.out.println(list1.equals(list2)+" "+list1.toString()+" "+list2.toString());
	}

}
