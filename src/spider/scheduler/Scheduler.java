package spider.scheduler;

import java.util.LinkedList;

public class Scheduler {

	private LinkedList<Request> requestsQueue = new LinkedList<Request>();
	private DuplicateRemover duplicateRemover = new DuplicateRemover();
		
	/**
	 * ��ȡ���Ƴ�����Ԫ��
	 * @return ����Ԫ��
	 */
	public  synchronized Request poll(){
		return requestsQueue.poll();
	}	
	/**
	 * Ԫ�����
	 * @param request
	 */
	public synchronized boolean push(Request request){
		if(duplicateRemover.isDuplicate(request)) return false;
		return requestsQueue.add(request);
	}
	

	
	public synchronized boolean isEmpty(){
		return requestsQueue.isEmpty();
	}
	
	public synchronized long size() {
		return requestsQueue.size();
	}
	

	
}
