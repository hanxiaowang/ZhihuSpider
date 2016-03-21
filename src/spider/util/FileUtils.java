package spider.util;

public class FileUtils {
	
	public static final String LINESEPERATOR = System.getProperty("line.separator");
	
	public static final String FILESEPERATOR = System.getProperty("file.separator");
	//�û���ǰ·��
	public static final String CURRENTPATH = System.getProperty("user.dir");
	//ͼƬ���·��
	public static final String IMAGEPATH = CURRENTPATH + FILESEPERATOR + "images" + FILESEPERATOR;
	//���ļ����·��
	public static final String ANSWERPATH = CURRENTPATH + FILESEPERATOR + "answers" + FILESEPERATOR;
	
	public static String validateFilename(String fileName){
		fileName = fileName.trim();
		fileName = fileName.replaceAll("[\\/]",	 "--");
		fileName = fileName.replaceAll("[\\s+]", "");
		return fileName;
	}
}
