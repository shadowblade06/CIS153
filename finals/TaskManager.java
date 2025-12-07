package finals;

import java.util.LinkedList;

public class TaskManager<T extends Comparable<T>> {
	LinkedList<Task> taskList = new LinkedList<Task>();
	
	public void add(Task task) {
		taskList.add(task);
	}
	
	public void remove(Task task) {
		taskList.remove(task);
	}
	
	public Task peak() {
		return taskList.peek();
	}
	
	public String printList() {
		return taskList.toString();
	}

}
