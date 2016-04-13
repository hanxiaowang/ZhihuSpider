package spider.html;

/**
 * HtmlPage����������Downloader����������htmlҳ�棬����Ϊ�м�ý�齫ҳ�洫�ݸ�Parser������������������Ľ��,
 * �ڽ�����������request����Scheduler����Ҫ�����������ı����ݴ��ݸ�Pipeline��
 */
import java.util.ArrayList;
import java.util.List;

import spider.scheduler.Request;

public class HtmlPage {
	
	private List<Request> requests = new ArrayList<>();
	private QuestionNode question ;
	private List<String> answers = new ArrayList<>();
	private String htmlText;
	
	private boolean isSkip = false;
	
	public HtmlPage( String htmlText){
		this.htmlText = htmlText;
	}

	public String getHtmlText() {
		return htmlText;
	}
	public void setHtmlText(String htmlText) {
		this.htmlText = htmlText;
	}
	public QuestionNode getQuestion() {
		return question;
	}
	public void setQuestion(QuestionNode question) {
		this.question = question;
	}
	
	public List<String> getAnswers() {
		return answers;
	}
	
	public void addAllAnswers(List<String> answers) {
		this.answers.addAll(answers);
	}
	
	public void addAnswer(String answer) {
		this.answers.add(answer);
	}
	
	public List<Request> getRequests() {
		return requests;
	}
	
	public void addRequest(Request request) {
		this.requests.add(request);
	}
	
	public void addAllRequests(List<Request> requests) {
		this.requests.addAll(requests);
	}

	public boolean isSkip() {
		return isSkip;
	}

	public void setSkip(boolean isSkip) {
		this.isSkip = isSkip;
	}
	
}
