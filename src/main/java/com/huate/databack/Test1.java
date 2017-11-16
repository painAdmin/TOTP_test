package com.huate.databack;

import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
       
	}
	/**
	 * 执行linux命令
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public static void execLinuxCmd() throws InterruptedException, IOException{
		 String path=Test1.class.getResource("/restart.sh").getPath();
	        String command1 = "chmod 777 ./restart";
	        Runtime.getRuntime().exec(command1).waitFor();
	        Runtime run=Runtime.getRuntime();
	        Process process=run.exec("sh "+path);   
	        process.waitFor();
	}
}
