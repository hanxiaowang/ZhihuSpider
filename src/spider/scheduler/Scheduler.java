package spider.scheduler;

import java.util.LinkedList;

public class Scheduler {

	private LinkedList<Request> requestsQueue = new LinkedList<Request>();
	private DuplicateRemover duplicateRemover = new DuplicateRemover();
		
	/**
	 * ��ȡ���Ƴ�����request
	 * @return ����request
	 */
	public  synchronized Request poll(){
		return requestsQueue.poll();
	}	
	/**
	 * request���
	 * @param request
	 */
	public synchronized boolean push(Request request){
		if(duplicateRemover.isDuplicate(request)) return false;
		return requestsQueue.add(request);
	}
	

	
	public synchronized boolean isEmpty(){
		return requestsQueue.isEmpty();
	}
	/**
	 * @return ʣ���������
	 */
	public synchronized long toDoSize() {
		return requestsQueue.size();
	}
	/**
	 * @return �ܵ�������
	 */
	public synchronized long totalCount(){
		return duplicateRemover.getTotalRequestsCount();
	}

	
}
