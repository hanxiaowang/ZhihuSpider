package spider.scheduler;

import java.util.HashSet;
import java.util.Set;


public class DuplicateRemover {
	
	private Set<String>  urls = new HashSet<String>();
	
	public boolean isDuplicate(Request request){
		
		return !urls.add(request.getUrl());
	}
	/**
	 * ������������
	 */
    public void resetDuplicateCheck(){
        urls.clear();
    }
    /**
     * ��ȡ����������
     * @return
     */
    public int getTotalRequestsCount() {
        return urls.size();
    }

}
