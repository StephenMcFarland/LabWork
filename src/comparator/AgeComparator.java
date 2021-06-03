package comparator;

import java.util.Comparator;

	class AgeComparator implements Comparator{  
			public int compare(Object o1,Object o2){  
			Player s1=(Player)o1;  
			Player s2=(Player)o2;  
			  
			if(s1.age==s2.age)  
			return 0;  
			else if(s1.age>s2.age)  
			return 1;  
			else  
			return -1;  
			}  
			}

