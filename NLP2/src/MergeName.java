import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class MergeName {

	
	public static void main(String[] args) {
		

		mergeVe();
		
	}
	
	
	public static void mergeVe(){
		
		try {
			BufferedReader io=new BufferedReader(new FileReader("./test/news/newssplit.txt"));
			PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("./test/news/name1.txt")));
			String s=null;
			while((s=io.readLine())!=null){
			
				int bgn=0,end=0;
				while(true){
					if(bgn==-1)break;
					if(bgn+1>=s.length()||end+1>=s.length())break;
					bgn=s.indexOf("¡¶",bgn+1);
					end=s.indexOf("¡·",end+1);
					if(bgn!=-1&&end!=-1){
						if(bgn+1<s.length()&&end>=0&&bgn+1<=end){
						String res=s.substring(bgn+1, end);
						res+="\t"+"nve";
						out.println(res);
						}
					}
					
				}
				
				
				
			}
			io.close();
			out.flush();
			out.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


     public static void mergeStar(){
     	try {
 			BufferedReader io=new BufferedReader(new FileReader("./test/news/newsfliter.txt"));
 			PrintWriter out=new PrintWriter(new BufferedWriter(new FileWriter("./test/news/name1.txt")));
 			String s=null;
 			while((s=io.readLine())!=null){
 			
 				
 				String[] res=s.split(" ");
 				
 				for(int i=0;i<res.length;i++){
 					String[] ss=res[i].split("/");
 					if(ss.length>=2){
 						//System.out.println(ss[0]+" "+ss[1]);
 					if(ss[1].equals("nr1")){
 						//System.out.println(res[i]);
 						StringBuilder sb=new StringBuilder();
 						sb.append(ss[0]);
 					/*	if(i+1<res.length){
 							if(res[i+1].length()>=2){
 								sb.append(((res[i+1]).split("/"))[0]);
 							}
 							else if(i+2<res.length){
 								sb.append(((res[i+1]).split("/"))[0])
 								  .append(((res[i+2]).split("/"))[0]);
 							}
 						}
 						*/
 						if(i+2<res.length){
 							(sb.append(((res[i+1]).split("/"))[0]))
 							  .append(((res[i+2]).split("/"))[0]);
 						}
 						System.out.println(sb.toString());
 						out.println(sb.toString());
 					}
 					}
 				}
 			}
 			io.close();
 			out.flush();
 			out.close();
 			
 			
 			
 		} catch (Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 	
     }
}