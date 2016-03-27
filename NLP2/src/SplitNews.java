import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;


public class SplitNews {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		splitIntoSentences("./test/news/news.txt", "./test/news/newssplit.txt");
		//splitIntoPara("./test/para.txt", "./test/parasplit.txt");
	}
	
	public static void splitIntoSentences(String src,String des){
		try {
			BufferedReader in=new BufferedReader(new FileReader(src));
			String line;
			StringBuilder res=new StringBuilder();
			while((line=in.readLine())!=null){
				line.trim();
				res=res.append(line);
			}
			
			String[] ss=res.toString().split("¡£|!");
			
			PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter(des)));
			for(String s:ss){
				out.println(s);
				System.out.println(s);
			}
			
			out.flush();
			in.close();
			out.close();
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	}
	public static void splitIntoPara(String src,String des){
		
		
		ArrayList<String> res=new ArrayList<String>();
		StringBuilder sb=new StringBuilder();
		
		try {
			BufferedReader in=new BufferedReader(new FileReader(src));
			int ch=0;
			while((ch=in.read())!=-1){
				
				if(ch=='\n'){
					res.add(sb.toString());
					sb.delete(0, sb.length());
					
				}
				else {
					sb.append((char)ch);
				}
				
			}
			res.add(sb.toString());
			PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter(des)));
			Iterator<String> iterator=res.iterator();
			while(iterator.hasNext()){
				
				String s=iterator.next();
				out.println(s);
		
				
				
			}
			
			in.close();
			out.flush();
			out.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	}
	

}
