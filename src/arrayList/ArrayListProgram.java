package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListProgram {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Aman");
		list.add("Java");
		list.add("Mahit");
		list.add("Arpit");
		
		//Using foreach loop using lambda expression
		
		list.forEach(x -> {
			System.out.println(x);
		});
		
		//Using iterator
		
		Iterator<String> itr  = list.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		//Using for each loop
		
		for(String str1 : list) {
			System.out.println(str1);
		}
		
		//Using listiterator() to traverse in both direction
		
		ListIterator<String> itr1 = list.listIterator(list.size());
		
		while(itr1.hasPrevious()) {
			String lists = itr1.previous();
			System.out.println(lists);
		}
		
	}

}
