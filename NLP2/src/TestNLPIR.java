import kevin.zhang.NLPIR;

import java.util.*;
import java.io.*;

public class TestNLPIR {

	public static void main(String[] args) throws Exception
	{
		try
		{
			String sInput = "张华平推出的NLPIR分词系统，又名ICTCLAS2013，新增新词识别、关键词提取、微博分词功能。";

			//自适应分词
			test(sInput);		
			
		}
		catch (Exception ex)
		{
		} 


	}

	public static void test(String sInput)
	{
		try
		{
			
			NLPIR testNLPIR = new NLPIR();
	        String argu = "./file/";
		    System.out.println("NLPIR_Init");
		//0表示编码为GBK，设为1，在Eclipse调用文字乱码
	     	if (testNLPIR.NLPIR_Init(argu.getBytes("gb2312"),0) == false)
			   {
				System.out.println("Init Fail!");
				return;
			   } 
		//导入用户词典前,设置为0，表示去除了角色标注；设置1，加上角色标注
	     	
	        byte nativeBytes[] = testNLPIR.NLPIR_ParagraphProcess(sInput.getBytes("GB2312"), 0);
	        String nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
	        System.out.println("分词结果为： " + nativeStr);
			
	        
			
			testNLPIR.NLPIR_FileProcess("./test/news/news.txt".getBytes("GB2312"),"./test/news/news_res.txt".getBytes("GB2312") , 1);
	      /*  String s="分词系统  nn";
	     	byte [] ret=s.getBytes("GB2312");
	     	testNLPIR.NLPIR_AddUserWord(ret);
	        
	        testNLPIR.NLPIR_AddUserWord("微博 nn".getBytes());
	        byte[] resBytes=testNLPIR.NLPIR_ParagraphProcess(sInput.getBytes("GB2312"), 0);
	        System.out.println("加入新词后的分词结果为： "+new String(resBytes,0,resBytes.length,"GB2312"));
	       */ 
	       // testNLPIR.NLPIR_SaveTheUsrDic();
	        
	        
	        
	   //     String ss="分词系统";
	   //     byte[] s1=ss.getBytes();
	   //     testNLPIR.NLPIR_DelUsrWord(s1);
	   //     resBytes=testNLPIR.NLPIR_ParagraphProcess(sInput.getBytes(), 0);
	   //     System.out.println("删除新词后的分词结果为： "+new String(resBytes,0,resBytes.length,"GB2312"));
	        /*
            testNLPIR.NLPIR_AddUserWord(ret);
	        
	        testNLPIR.NLPIR_AddUserWord("微博 nn".getBytes());
	        resBytes=testNLPIR.NLPIR_ParagraphProcess(sInput.getBytes("GB2312"), 0);
	        System.out.println("第二次加入新词后的分词结果为： "+new String(resBytes,0,resBytes.length,"GB2312"));
	        */
	        /*
	        String s1="./test/test.TXT";
	        String r1="./test/res.TXT";
	        
	        if(testNLPIR.NLPIR_FileProcess(s1.getBytes("GB2312"), r1.getBytes("GB2312"), 0)==true){
	        	System.out.println("success!");
	        }
	        else {
				
	        	System.out.println("fail");
			}
	        
	        
	        String s2="./test/userDict.TXT";
	        
	        String line="操作系统是计算机中的最重要的系统软件。";
	        nativeBytes=testNLPIR.NLPIR_ParagraphProcess(line.getBytes("GB2312"), 0);
	        System.out.println("加入词典之前："+new String(nativeBytes, 0, nativeBytes.length, "GB2312"));
	       */
	       
	       
	       
	       /* 
	        int cnt=testNLPIR.NLPIR_ImportUserDict(s2.getBytes("GB2312"));
	        
	        System.out.println("加入了"+cnt+"个新词");
	        
	        nativeBytes=testNLPIR.NLPIR_ParagraphProcess(line.getBytes("GB2312"), 0);
	        System.out.println("加入词典之后："+new String(nativeBytes, 0, nativeBytes.length, "GB2312"));
	        
	       */ 
	        /*
	        String sline = "哎~那个金刚圈尺寸太差，前重后轻，左宽右窄，他戴上去很不舒服，"
	                + "整晚失眠会连累我嘛，他虽然是只猴子，但你也不能这样对他啊，官府知道会说我虐待动物的，"
	                + "说起那个金刚圈，啊~去年我在陈家村认识了一个铁匠，他手工精美，价钱又公道，童叟无欺，"
	                + "干脆我介绍你再定做一个吧！";
	       
	        
	        nativeBytes=testNLPIR.NLPIR_GetKeyWords(sline.getBytes("GB2312"),10 , false);
	        System.out.println("关键词："+new String(nativeBytes, 0, nativeBytes.length, "GB2312"));
	        
	        
	        nativeBytes=testNLPIR.NLPIR_GetNewWords(sline.getBytes("GB2312"), 10, false);
	        System.out.println("新词："+new String(nativeBytes, 0, nativeBytes.length, "GB2312"));
	        */
	        
	        String argu1 = "./test/test.TXT";
			String argu2 = "./test/test_result1.TXT";
		/*
			nativeBytes  =testNLPIR.NLPIR_GetFileNewWords(argu1.getBytes("GB2312"),50,false);
			//如果是处理内存，可以调用testNLPIR.NLPIR_GetNewWords
			nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
			System.out.println("新词识别结果1： " + nativeStr);
			
			nativeBytes  =testNLPIR.NLPIR_GetFileKeyWords(argu1.getBytes("GB2312"),50,false);
			//如果是处理内存，可以调用testNLPIR.NLPIR_GetKeyWords
			nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
			System.out.println("关键词识别结果为： " + nativeStr);
	      */  
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	
			/*String argu = "../../";
			System.out.println("NLPIR_Init");
			if (testNLPIR.NLPIR_Init(argu.getBytes("GB2312"),1) == false)
			{
				System.out.println("Init Fail!");
				return;
			}
			
					//导入用户词典前
			byte nativeBytes[] = testNLPIR.NLPIR_ParagraphProcess(sInput.getBytes("GB2312"), 1);
			String nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
	
			System.out.println("分词结果为： " + nativeStr);

	
			
			//初始化分词组件
			 * 
			 * 
			String argu1 = "E:/NLPIR/test/test.TXT";
			String argu2 = "E:/NLPIR/test/test_result1.TXT";
		
			nativeBytes  =testNLPIR.NLPIR_GetFileNewWords(argu1.getBytes("GB2312"),50,true);
			//如果是处理内存，可以调用testNLPIR.NLPIR_GetNewWords
			nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
			System.out.println("新词识别结果为： " + nativeStr);
			
			nativeBytes  =testNLPIR.NLPIR_GetFileKeyWords(argu1.getBytes("GB2312"),50,true);
			//如果是处理内存，可以调用testNLPIR.NLPIR_GetKeyWords
			nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
			System.out.println("关键词识别结果为： " + nativeStr);
			
			
			
			testNLPIR.NLPIR_FileProcess(argu1.getBytes("GB2312"), argu2.getBytes("GB2312"), 1);
	
			testNLPIR.NLPIR_NWI_Start();
			testNLPIR.NLPIR_NWI_AddFile(argu1.getBytes("GB2312"));
			
			testNLPIR.NLPIR_NWI_Complete();
			
			nativeBytes= testNLPIR.NLPIR_NWI_GetResult(true);
			nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
	
			System.out.println("新词识别结果 " + nativeStr);
		
			testNLPIR.NLPIR_NWI_Result2UserDict();//新词识别结果
			argu2 = "E:/NLPIR/test/test_result2.TXT";
			testNLPIR.NLPIR_FileProcess(argu1.getBytes("GB2312"), argu2.getBytes("GB2312"), 1);

			*/
			
			
			
			testNLPIR.NLPIR_NWI_Start();
			testNLPIR.NLPIR_NWI_AddFile("./test/test.TXT".getBytes());
			testNLPIR.NLPIR_NWI_Complete();
			
			nativeBytes=testNLPIR.NLPIR_NWI_GetResult(false);
			System.out.println("新词识别结果2："+new String(nativeBytes,0,nativeBytes.length,"GB2312"));
			
			testNLPIR.NLPIR_NWI_Result2UserDict();
			testNLPIR.NLPIR_SaveTheUsrDic();
			
			testNLPIR.NLPIR_FileProcess(argu1.getBytes(), argu2.getBytes(),0);
			
			testNLPIR.NLPIR_Exit();
			
			
		/*	
			NLPIR nlpir=new NLPIR();
			System.out.println("NLPIR init");
			if(nlpir.NLPIR_Init("./file/".getBytes("utf-8"), 1)==false){
				
				System.out.println("init fail!");
				
			}
			
			if(nlpir.NLPIR_FileProcess("./test/test-utf-8.TXT".getBytes("utf-8"), "./test/test-utf-8_res.TXT".getBytes("utf-8"), 0)==false)
				System.out.println("read fail");
			
			nlpir.NLPIR_Exit();
			*/
			
			
			
			
			
			
			
			
		}
		catch (Exception ex)
		{
		} 
}
}
 
