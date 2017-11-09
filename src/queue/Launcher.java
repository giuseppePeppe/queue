package queue;

public class Launcher {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleQueue queueSimp = new SimpleQueue();
		
		
		
		MonitorableQueue queueMon = new MonitorableQueue();
		
		//Insert element on simpleQueue		
		queueSimp.enqueue("Giuseppe");
		queueSimp.enqueue("Piero");
		queueSimp.enqueue("Francesco");
		queueSimp.enqueue("Peppino");
		
		//Insert element on monitorableQueue
		queueMon.enqueue("Giovanni");
		queueMon.enqueue("Luca");
		queueMon.enqueue("Samuele");
	    
		//Display lenght of Monitorable queue 	
		System.out.println("Max size of queue Monitirable :" +queueMon.maxSize()); 
		
		//Remove element from simpleQueue
		
		queueSimp.dequeue();
		queueSimp.dequeue();
		
		//Remove element from simpleQueue
		
		queueMon.dequeue();
		queueMon.dequeue();
		
		//Display lenght of Monitorable queue 	
		System.out.println("Max size of queue Monitirable after dequeue operations :" +queueMon.maxSize()); 
		
		//Display the head element of queue
		
		System.out.println("Head element of simpleQueue is :" +queueSimp.peek()); 
		System.out.println("Head element of simpleQueue is :" +queueMon.peek()); 
		

		
	}

}
