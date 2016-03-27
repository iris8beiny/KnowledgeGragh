import kevin.zhang.NLPIR;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;


public class FilterSentences {

	
	
	public static void main(String[] args) {
		
		filter("./test/news/newssplit.txt", "./test/news/newsfilter.txt");
		

	}
	
	public static void filter(String src,String des){
	
		try {
			BufferedReader in=new BufferedReader(new FileReader(src));
			PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter(des)));
			String s=null;
			while((s=in.readLine())!=null){
				
				String d=sign(s);
				System.out.println(d);
				if(!d.contains("/nr"))
					continue;
				Pattern pattern=Pattern.compile("/nr|¡¶");
				Matcher matcher=pattern.matcher(d);
				int cnt=0;
				while(matcher.find()){
					
					cnt++;
				}
				System.out.println(cnt);
				if(cnt>=2){
					out.println(d);
				}
				
			}
			
		
			in.close();
			out.flush();
			out.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static String sign(String s){
		
		NLPIR nlpir=new NLPIR();
		try {
			if(nlpir.NLPIR_Init("./file/".getBytes("gb2312"), 0)==false)
				System.out.println("init fail!");
			byte[] bs=nlpir.NLPIR_ParagraphProcess(s.getBytes(), 1);
			return new String(bs,0,bs.length,"gb2312");
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	
		
	}
	

}
