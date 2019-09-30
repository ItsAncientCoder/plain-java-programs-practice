package com.plain.java.programs;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

public class DownloadFileFromInternet {

	public static void main(String[] args) throws IOException {
		
		String link = "http://ocl-jenkinsidc01.idc1.level3.com:8080/job/CIIT-Normalize/21/com.level3.noctools.ciit$normalize/artifact/com.level3.noctools.ciit/normalize/6.7-20190906.124522-5/normalize-6.7-20190906.124522-5.jar";
		String dest_dir = "C:\\Users\\ac29019\\Documents\\normalize-6.7-20190906.124522-5.jar";
		File file = new File(dest_dir); 
		URL url = new URL(link);
		FileUtils.copyURLToFile(url, file);
		System.out.println("FILE DOWNLOADED");
	}

}
