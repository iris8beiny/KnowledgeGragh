import kevin.zhang.NLPIR;

import java.util.*;
import java.io.*;

public class TestNLPIR {

	public static void main(String[] args) throws Exception
	{
		try
		{
			String sInput = "�Ż�ƽ�Ƴ���NLPIR�ִ�ϵͳ������ICTCLAS2013�������´�ʶ�𡢹ؼ�����ȡ��΢���ִʹ��ܡ�";

			//����Ӧ�ִ�
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
		//0��ʾ����ΪGBK����Ϊ1����Eclipse������������
	     	if (testNLPIR.NLPIR_Init(argu.getBytes("gb2312"),0) == false)
			   {
				System.out.println("Init Fail!");
				return;
			   } 
		//�����û��ʵ�ǰ,����Ϊ0����ʾȥ���˽�ɫ��ע������1�����Ͻ�ɫ��ע
	     	
	        byte nativeBytes[] = testNLPIR.NLPIR_ParagraphProcess(sInput.getBytes("GB2312"), 0);
	        String nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
	        System.out.println("�ִʽ��Ϊ�� " + nativeStr);
			
	        
			
			testNLPIR.NLPIR_FileProcess("./test/news/news.txt".getBytes("GB2312"),"./test/news/news_res.txt".getBytes("GB2312") , 1);
	      /*  String s="�ִ�ϵͳ  nn";
	     	byte [] ret=s.getBytes("GB2312");
	     	testNLPIR.NLPIR_AddUserWord(ret);
	        
	        testNLPIR.NLPIR_AddUserWord("΢�� nn".getBytes());
	        byte[] resBytes=testNLPIR.NLPIR_ParagraphProcess(sInput.getBytes("GB2312"), 0);
	        System.out.println("�����´ʺ�ķִʽ��Ϊ�� "+new String(resBytes,0,resBytes.length,"GB2312"));
	       */ 
	       // testNLPIR.NLPIR_SaveTheUsrDic();
	        
	        
	        
	   //     String ss="�ִ�ϵͳ";
	   //     byte[] s1=ss.getBytes();
	   //     testNLPIR.NLPIR_DelUsrWord(s1);
	   //     resBytes=testNLPIR.NLPIR_ParagraphProcess(sInput.getBytes(), 0);
	   //     System.out.println("ɾ���´ʺ�ķִʽ��Ϊ�� "+new String(resBytes,0,resBytes.length,"GB2312"));
	        /*
            testNLPIR.NLPIR_AddUserWord(ret);
	        
	        testNLPIR.NLPIR_AddUserWord("΢�� nn".getBytes());
	        resBytes=testNLPIR.NLPIR_ParagraphProcess(sInput.getBytes("GB2312"), 0);
	        System.out.println("�ڶ��μ����´ʺ�ķִʽ��Ϊ�� "+new String(resBytes,0,resBytes.length,"GB2312"));
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
	        
	        String line="����ϵͳ�Ǽ�����е�����Ҫ��ϵͳ�����";
	        nativeBytes=testNLPIR.NLPIR_ParagraphProcess(line.getBytes("GB2312"), 0);
	        System.out.println("����ʵ�֮ǰ��"+new String(nativeBytes, 0, nativeBytes.length, "GB2312"));
	       */
	       
	       
	       
	       /* 
	        int cnt=testNLPIR.NLPIR_ImportUserDict(s2.getBytes("GB2312"));
	        
	        System.out.println("������"+cnt+"���´�");
	        
	        nativeBytes=testNLPIR.NLPIR_ParagraphProcess(line.getBytes("GB2312"), 0);
	        System.out.println("����ʵ�֮��"+new String(nativeBytes, 0, nativeBytes.length, "GB2312"));
	        
	       */ 
	        /*
	        String sline = "��~�Ǹ����Ȧ�ߴ�̫�ǰ�غ��ᣬ�����խ��������ȥ�ܲ������"
	                + "����ʧ�߻������������Ȼ��ֻ���ӣ�����Ҳ�����������������ٸ�֪����˵��Ű������ģ�"
	                + "˵���Ǹ����Ȧ����~ȥ�����ڳ¼Ҵ���ʶ��һ�����������ֹ���������Ǯ�ֹ�����ͯ�����ۣ�"
	                + "�ɴ��ҽ������ٶ���һ���ɣ�";
	       
	        
	        nativeBytes=testNLPIR.NLPIR_GetKeyWords(sline.getBytes("GB2312"),10 , false);
	        System.out.println("�ؼ��ʣ�"+new String(nativeBytes, 0, nativeBytes.length, "GB2312"));
	        
	        
	        nativeBytes=testNLPIR.NLPIR_GetNewWords(sline.getBytes("GB2312"), 10, false);
	        System.out.println("�´ʣ�"+new String(nativeBytes, 0, nativeBytes.length, "GB2312"));
	        */
	        
	        String argu1 = "./test/test.TXT";
			String argu2 = "./test/test_result1.TXT";
		/*
			nativeBytes  =testNLPIR.NLPIR_GetFileNewWords(argu1.getBytes("GB2312"),50,false);
			//����Ǵ����ڴ棬���Ե���testNLPIR.NLPIR_GetNewWords
			nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
			System.out.println("�´�ʶ����1�� " + nativeStr);
			
			nativeBytes  =testNLPIR.NLPIR_GetFileKeyWords(argu1.getBytes("GB2312"),50,false);
			//����Ǵ����ڴ棬���Ե���testNLPIR.NLPIR_GetKeyWords
			nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
			System.out.println("�ؼ���ʶ����Ϊ�� " + nativeStr);
	      */  
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	
			/*String argu = "../../";
			System.out.println("NLPIR_Init");
			if (testNLPIR.NLPIR_Init(argu.getBytes("GB2312"),1) == false)
			{
				System.out.println("Init Fail!");
				return;
			}
			
					//�����û��ʵ�ǰ
			byte nativeBytes[] = testNLPIR.NLPIR_ParagraphProcess(sInput.getBytes("GB2312"), 1);
			String nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
	
			System.out.println("�ִʽ��Ϊ�� " + nativeStr);

	
			
			//��ʼ���ִ����
			 * 
			 * 
			String argu1 = "E:/NLPIR/test/test.TXT";
			String argu2 = "E:/NLPIR/test/test_result1.TXT";
		
			nativeBytes  =testNLPIR.NLPIR_GetFileNewWords(argu1.getBytes("GB2312"),50,true);
			//����Ǵ����ڴ棬���Ե���testNLPIR.NLPIR_GetNewWords
			nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
			System.out.println("�´�ʶ����Ϊ�� " + nativeStr);
			
			nativeBytes  =testNLPIR.NLPIR_GetFileKeyWords(argu1.getBytes("GB2312"),50,true);
			//����Ǵ����ڴ棬���Ե���testNLPIR.NLPIR_GetKeyWords
			nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
			System.out.println("�ؼ���ʶ����Ϊ�� " + nativeStr);
			
			
			
			testNLPIR.NLPIR_FileProcess(argu1.getBytes("GB2312"), argu2.getBytes("GB2312"), 1);
	
			testNLPIR.NLPIR_NWI_Start();
			testNLPIR.NLPIR_NWI_AddFile(argu1.getBytes("GB2312"));
			
			testNLPIR.NLPIR_NWI_Complete();
			
			nativeBytes= testNLPIR.NLPIR_NWI_GetResult(true);
			nativeStr = new String(nativeBytes, 0, nativeBytes.length, "GB2312");
	
			System.out.println("�´�ʶ���� " + nativeStr);
		
			testNLPIR.NLPIR_NWI_Result2UserDict();//�´�ʶ����
			argu2 = "E:/NLPIR/test/test_result2.TXT";
			testNLPIR.NLPIR_FileProcess(argu1.getBytes("GB2312"), argu2.getBytes("GB2312"), 1);

			*/
			
			
			
			testNLPIR.NLPIR_NWI_Start();
			testNLPIR.NLPIR_NWI_AddFile("./test/test.TXT".getBytes());
			testNLPIR.NLPIR_NWI_Complete();
			
			nativeBytes=testNLPIR.NLPIR_NWI_GetResult(false);
			System.out.println("�´�ʶ����2��"+new String(nativeBytes,0,nativeBytes.length,"GB2312"));
			
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
 
