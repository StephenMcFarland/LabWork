package Day3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class D3Lab9 {

	public static void main(String[] args) {
		// Write a program to Open a text file so that you can read the file one line at a time.
		// Read each line as a String and print the total number of characters.

		
		// Open the file
		try(
		FileInputStream fstream = new FileInputStream("C://Users/snmcf/Documents/readio.txt")){
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		//Read File Line By Line
		while ((strLine = br.readLine()) != null)   {
		  // Print the content on the console
		  System.out.println (strLine+" number of characters: "+strLine.length());
		}

		//Close the input stream
		fstream.close();
		}catch (Exception ex) {  
	        System.out.println(ex.getMessage());
		}
//		try (BufferedReader br = new BufferedReader(new FileReader("C://Users/snmcf/Documents/readio.txt"))) {
//		    String line;
//		    while ((line = br.readLine()) != null) {
//		       System.out.println(line);
//		    }
//		
//		}
		
//		try (Stream<String> stream = Files.lines(Paths.get("C://Users/snmcf/Documents/readio.txt"))) {
//	        //stream.forEach(System.out::println);
//	        String[] streamArr = (String[]) stream.toArray();
//	        System.out.println(streamArr[0]);
//	}catch (Exception ex) {  
//        System.out.println(ex.getMessage());  
//    }
//		 try {  
//	            Reader reader = new FileReader("C://Users/snmcf/Documents/readio.txt");  
//	            int data = reader.read();  
//	            while (data != -1) {  
//	                System.out.print((char) data);  
//	                data = reader.read();  
//	            }  
//	            reader.close();  
//	        } catch (Exception ex) {  
//	            System.out.println(ex.getMessage());  
//	        } 

	}
}
	 //Specify the path of the file here
/*    File file = new File("C://Users/snmcf/Documents/readio.txt");
    BufferedInputStream bis = null;
    FileInputStream fis=null;
    int numChars = 0;

    try
    {    
        //FileInputStream to read the file
        fis = new FileInputStream(file);

        Passed the FileInputStream to BufferedInputStream
         *For Fast read using the buffer array.
        bis = new BufferedInputStream(fis);

        available() method of BufferedInputStream
         * returns 0 when there are no more bytes
         * present in the file to be read
        while( bis.available() > 0 ){             	
            System.out.print((char)bis.read());
        }

     }catch(FileNotFoundException fnfe)
      {
          System.out.println("The specified file not found" + fnfe);
      }
      catch(IOException ioe)
      {
          System.out.println("I/O Exception: " + ioe); 
      }
      finally
      {
          try{
             if(bis != null && fis!=null)
             {
     	          fis.close();
                bis.close();
             }      
           }catch(IOException ioe)
            {
                System.out.println("Error in InputStream close(): " + ioe);
            }         
      }
 }*/    

	
