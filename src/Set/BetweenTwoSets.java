import java.util.HashSet;

public class BetweenTwoSets {

	public static void main(String[] args) {
		// 
		//ArrayList<Integer> fa = new ArrayList<Integer>();
	    HashSet<Integer> f = new HashSet<Integer>();
	    boolean factor = false;
	    
	    for(int ba=1;ba<101;ba++){
	        for(int i=0;i<b.size();i++){
	            
	            if(b.get(i)%ba==0){
	                factor = true;
	                if(factor){
	                   f.add(ba);
	                   //fa.add(ba); 
	                }else{f.remove(ba);}
	                
	            }
	        }
	    }
	    
	    factor=false;
	     for(int ba=1;ba<101;ba++){
	        for(int i=0;i<a.size();i++){
	            
	            if(ba%a.get(i)==0){
	                factor = true;
	                if(factor){
	                   f.add(ba);
	                   //fa.add(ba); 
	                }else{f.remove(ba);}
	                
	            }
	        }
	    }
	    return f.size();
	    }

	}

}
