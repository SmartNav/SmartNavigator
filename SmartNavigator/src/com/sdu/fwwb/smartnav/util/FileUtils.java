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
	
	 /**
     * 写文件到本地
     * @param in 输入的文件流
     * @param fileName 上传的文件名
     * @throws IOException
     * @return 文件的相对路径
     */
    public static String copyFile(ServletContext sc,InputStream in, String fileName) throws IOException {
        // 取得当前的路径
        String path = sc.getRealPath("")+PLACE_UPLOAD_PATH;
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
