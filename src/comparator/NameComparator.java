package comparator;

import java.util.Comparator;

	class NameComparator implements Comparator{  
	public int compare(Object o1,Object o2){  
	Player s1=(Player)o1;  
	Player s2=(Player)o2;  
	  
	return s1.name.compareTo(s2.name);  
	}  
	}

