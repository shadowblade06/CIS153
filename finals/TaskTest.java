package finals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {
	
	@Test
	public void testTask() {
		Task task1 = new Task("task", 3);
		
		String expected = "Task: task Priority: 3";
		String actual = task1.toString();
		
		assertEquals(actual, expected);
		
		Task task2 = new Task("test", 2);
		
		expected = "Task: test Priority: 2";
		actual = task2.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTaskManager() {
		Task task = new Task("test1", 3);
		TaskManager tm = new TaskManager();
		
		tm.add(task);
		
		String expected = "[Task: test1 Priority: 3]";
		String actual = tm.printList();
		
		assertEquals(expected, actual);
	}

}
