package Strategy;

import java.util.ArrayList;
import java.util.List;

public class SortableList {
	
	List<String> list ;
	
	public SortableList(List<String> list) {
		this.list = list;
	}
  
	public List<String> sort(SortStrategy sortStrategy){
		return sortStrategy.sort(this.list);
	}
	
	public static void main(String args[]){
		List<String> strList = new ArrayList<String>();
		strList.add("PREE");
		strList.add("suri");
		strList.add("apple");
		SortableList slist = new SortableList(strList);
		System.out.println(slist.sort(SortStrategy.SortDescending));
	}
}
