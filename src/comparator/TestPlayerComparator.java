package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestPlayerComparator {
	public static void main(String args[]){  
		  
		ArrayList al=new ArrayList();  
		al.add(new Player(101,"Ginni",23));  
		al.add(new Player(106,"Martin",27));  
		al.add(new Player(105,"Robert",21));  
		  
		System.out.println("Sorting by Name");  
		  
		Collections.sort(al,new NameComparator());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		Player st=(Player)itr.next();  
		System.out.println(st.ranking+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("Sorting by age");  
		  
		Collections.sort(al,new AgeComparator());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
		Player st=(Player)itr2.next();  
		System.out.println(st.ranking+" "+st.name+" "+st.age);  
		}  }
}
