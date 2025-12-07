package finals;

import java.util.PriorityQueue;

public class Task implements Comparable<Task>{
	String task;
	int priority;
	
	public Task() {
		task = "N/A";
		priority = 0;
	}
	
	public Task(String task, int priority) {
		this.task = task;
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		return "Task: " + task + " Priority: " + priority;
	}
	
	@Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }


}
