package Strategy;

import java.util.ArrayList;
import java.util.List;

public enum SortStrategy {
   SortAscending {
	   public List<String> sort(List<String> list){
		   List<String> copiedList = new ArrayList<String>(list);
		   copiedList.sort((String o1, String o2)->o1.compareTo(o2));
		   return copiedList;
	   };
   },
   SortDescending {
	   public List<String> sort(List<String> list){
		   List<String> copiedList = new ArrayList<String>(list);
		   copiedList.sort((String o1, String o2)->o2.compareTo(o1));
		   return copiedList;
	   };
   },
   
   
   ;
	
  	
   public abstract List<String> sort(List<String> list);
   
	
}
