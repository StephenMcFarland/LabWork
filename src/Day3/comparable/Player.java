package Day3.comparable;

class Player implements Comparable<Player>{

	public static void main(String[] args) {
		// Write a program to compare the ranking of Player where 
		// Player class has ranking, name and age as attributes using comparable interface.
		int ranking;  
		String name;  
		int age;  
	 Player(int ranking,String name,int age){  
		this.ranking=ranking;  
		this.name=name;  
		this.age=age;  
	}  
	  
	public int compareTo(Player player){  
		if(ranking==player.ranking)  
		return 0;  
		else if(ranking>player.ranking)  
		return 1;  	
		else  
		return -1;  
	} 
	}

	

}
