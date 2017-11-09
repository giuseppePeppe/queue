package queue;

import java.util.LinkedList;

public class SimpleQueue implements Queue {
	
	
	//private final int frontPointer = 0;
	 //private final int rearPointer = -1;
	 //private final Object[] queue = new Object[4];
	 //private ArrayLinkedList<Object> queue1 = new ArrayLinkedList<Object>();
	 LinkedList<Object> queue1 = new LinkedList<Object>();
	 private final static int MAXLENGHT = 10;
	 
	 @Override
	public void enqueue(Object o) {
		// TODO Auto-generated method stub
		 
	
		 if (!isFull()){
			 try {
				//rearPointer++;
				queue1.add(o);
				//queue[rearPointer] = o;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error queue is full! The element: " +o+" has not inserted");
			}
		 }
	}
	
	@Override
	public Object dequeue() {
		// TODO Auto-generated method stub		
				
		assert !isEmpty(); 
		
		//return queue1.removeFirst();
		//return queue[frontPointer++];
		return queue1.removeFirst();
		 		
		
	}
	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		
		//return queue[frontPointer];
		return queue1.getFirst();
		
	}
	
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub	
		
		//return (rearPointer > queue.length) ? true : false;
		return (queue1.size() >= MAXLENGHT) ? true : false;
		
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub		
		//return (frontPointer < 0 || frontPointer > rearPointer) ? true : false;
		return queue1.isEmpty();
	}

	 
	 
	
	 
	


}
