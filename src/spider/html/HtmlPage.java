package spider.html;

import java.net.URL;

public class HtmlPage {

	private URL url;
	private String htmlText;
	private String charset;
	


	public HtmlPage(URL url, String charset){
		this.url = url;
		this.charset =charset;
	}
	public void setUrl(URL url) {
		this.url = url;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}
	
	public URL getUrl(){
		return this.url;
	}
	
	public String getCharset() {
		return this.charset;
	}
	
	/**
	 * ��ȡ��ǰ��ҳ��Դ�ļ�
	 * @return html ��ҳԴ�ļ�
	 */
	public String getHtmlText(){

		return this.htmlText;
	}
	
	public void setHtmlText(String htmltext) {
		this.htmlText = htmltext;
	}
	


}
