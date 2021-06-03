package Day3.comparable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestPlayer {

	public static void main(String[] args) {
		ArrayList<Player> al=new ArrayList<Player>();  
		al.add(new Player(101,"Rupa",80));  
		al.add(new Player(106,"Ginni",27));  
		al.add(new Player(105,"Martin",25));  
		  
		Collections.sort(al);  
		for(Player pl:al){  
		System.out.println(pl.ranking+" "+pl.name+" "+pl.age);  
		}  

	}

}