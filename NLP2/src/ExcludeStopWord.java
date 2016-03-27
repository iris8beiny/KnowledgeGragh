import kevin.zhang.NLPIR;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;


public class ExcludeStopWord {
	
	
	public static void  main(String [] args){
		//createTable();
		exclude();
	}
	
	public static void exclude(){
		
		try {
			BufferedReader io=new BufferedReader(new FileReader("./test/news/newsfilter.txt"));
			BufferedReader st=new BufferedReader(new FileReader("./test/news/stopword.txt"));
			PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("./test/news/news_ex.txt")));
		    
			Set<String> swt=new HashSet<String>();
			
			String s=null;
			while((s=st.readLine())!=null){
				swt.add(s);
				
			}
			
			String para=null;
			while((para=io.readLine())!=null){
				
				para.trim();
				String[] res=para.split(" ");
				int bgn=-1,end=-1;
				for(int i=0;i<res.length;i++){
					
					String[] r=res[i].split("/");
					
					if(r[0].equals("¡¶")){
						bgn=i;
						res[i]=r[0];
						while(i+1<res.length){
							i++;
							
							if(res[i].equals("¡·/wky")){
								res[i]=(res[i].split("/"))[0];
								end=i;
								
								StringBuilder sbn=new StringBuilder();
								for(int j=bgn+1;j<=end-1;j++){
									res[j]=((res[j].split("/"))[0]);
									
								}
								
								break;
							}
														
						}
				
					}
					
					else if(swt.contains(r[0])){
						res[i]=null;
					}
					
				}
				
				StringBuilder f=new StringBuilder();
				for(int i=0;i<res.length ;i++){
					if(res[i]!=null){
						f.append(res[i]);
						if(res[i].equals("¡¶")){
							while(i+1<res.length){
								i++;
								
								if(res[i].equals("¡·")){
									//System.out.println("!!!");
									f.append(res[i]).append("/nve");
									break;
								}
								f.append(res[i]);
								
							}
							
						}
						f.append(" ");
							
					}
						
				}
				out.println(f);
				
			}
			
			
			st.close();
			io.close();
			out.flush();
			out.close();
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void createTable(){
		
		NLPIR nlpir=new NLPIR();
		try {
			if(nlpir.NLPIR_Init("./file/".getBytes("gb2312"), 0)==false)
				System.out.println("init fail!");
			nlpir.NLPIR_FileProcess("./test/news/stopword.txt".getBytes(),"./test/news/stopword1.txt".getBytes(), 1);
			
			
			
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block   
			e.printStackTrace();
		}
		
	}
	

}
