package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Filetranswer
{
public static void main(String[] args) throws Exception {
	String s1="pw2.java";
	String s2="pw1.java";
	int i;
	FileInputStream fis=new FileInputStream(s2);
	FileOutputStream bw=new FileOutputStream(s1,false);
	fis.skip(3);
	while((i=fis.read())!=-1)
	{
		bw.flush();
		bw.write(i);
	}
	bw.close();
	fis.close();
}
}
