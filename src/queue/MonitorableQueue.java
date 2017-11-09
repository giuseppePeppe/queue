package queue;

public class MonitorableQueue implements Queue{

	private int maxPointMarker = 0;
	private int size =0;
	SimpleQueue queueA = new SimpleQueue();
	

	@Override
	public void enqueue(Object o) {
		// TODO Auto-generated method stub
		if( ++size > maxPointMarker )
			maxPointMarker = size;
			queueA.enqueue(o);
	}
	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub
		--size;
		return queueA.dequeue();
	}
	@Override
	public Object peek() {
		return queueA.peek();
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isFull() {
		return queueA.isFull();
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isEmpty() {
		return queueA.isEmpty();
		// TODO Auto-generated method stub
		
	}
	
	public Object maxSize(){		
		
		return this.size;
		
		
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
}
