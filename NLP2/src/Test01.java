import kevin.zhang.NLPIR;

import java.util.*;
import java.io.*;


public class Test01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			test();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	


	public static void test() throws Exception{
		
		NLPIR nlpir=new NLPIR();
		
	    if(nlpir.NLPIR_Init("./file/".getBytes("gb2312"), 0)==false)
	    	System.out.println("init fail!");
	    
		
	
		nlpir.NLPIR_ImportUserDict("./test/news/name.txt".getBytes("gb2312"));
		nlpir.NLPIR_SaveTheUsrDic();
		
		
		//String arg="唐人影视是一档央视节目。";
		//byte[] nativebytes=nlpir.NLPIR_ParagraphProcess(arg.getBytes("GB2312"), 1);
		//System.out.println(new String(nativebytes,0,nativebytes.length,"GB2312"));
		
		
		nlpir.NLPIR_Exit();
		
		
	}

}
