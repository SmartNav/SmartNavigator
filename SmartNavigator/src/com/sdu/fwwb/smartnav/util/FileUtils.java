package com.sdu.fwwb.smartnav.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import javax.servlet.ServletContext;

import org.apache.log4j.Logger;

public class FileUtils {

	private static final Logger log = Logger.getLogger(FileUtils.class);
	
	public static final String PLACE_UPLOAD_PATH = "/up/place/";
	public static final String AVATAR_UPLOAD_PATH = "/up/avatar/";
	
	public static boolean isImg(String fileName){
		log.debug("fileName:"+fileName);
		String names[] = fileName.split("[.]");
		log.debug("names:"+names);
		log.debug("nameslength:"+names.length);
		String suffix = names[names.length-1];
		if(suffix.equalsIgnoreCase("png") || suffix.equalsIgnoreCase("jpg") || suffix.equalsIgnoreCase("jpeg") || suffix.equalsIgnoreCase("gif")){
			return true;
		}
		return false;
	}
	
	public static String copyFileToPlace(ServletContext sc,InputStream in, String fileName) throws IOException {
        return copyFile(sc,in,fileName,PLACE_UPLOAD_PATH);
	}
	
	public static String copyFileToAvatar(ServletContext sc,InputStream in, String fileName) throws IOException {
		return copyFile(sc,in,fileName,AVATAR_UPLOAD_PATH);
	}
	
	 /**
     * 写文件到本地
     * @param in 输入的文件流
     * @param fileName 上传的文件名
     * @throws IOException
     * @return 文件的相对路径
     */
    private static String copyFile(ServletContext sc,InputStream in, String fileName,String basePath) throws IOException {
        // 取得当前的路径
        String path = sc.getRealPath("")+basePath;
         log.debug("path:"+path);

         File pathFile = new File(path);
        if(!pathFile.exists())pathFile.mkdirs();
        String newFileName = new Date().getTime()+"-"+fileName;
        File f = new File(path+ newFileName);
        log.debug("f:"+f.getAbsolutePath());
        if(!f.exists())f.createNewFile();
        
        FileOutputStream fs = new FileOutputStream(f);
        log.debug("filePath:"+f.getAbsolutePath());
        byte[] buffer = new byte[1024 * 1024];
        int bytesum=0;
        int byteread = 0;
        while ((byteread = in.read(buffer)) != -1) {
            bytesum += byteread;
            fs.write(buffer, 0, byteread);
            fs.flush();
        }
        fs.close();
        in.close();
        return PLACE_UPLOAD_PATH+newFileName;
    }
	
}
