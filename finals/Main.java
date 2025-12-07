package finals;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PriorityQueue<Task> queue = new PriorityQueue<Task>();
		TaskManager<Task> taskManager = new TaskManager<Task>();
		Scanner scnr = new Scanner(System.in);
		String userInput = "";
		String taskName = "";
		int taskPriority = -1;
		
		while (!userInput.equals("q")) {
			System.out.println("Enter what you want to do (t) Enter task name (p) Enter task priority (a) Add your task (q) Quit");
			userInput = scnr.nextLine();
			if (userInput.equals("t")) {
				System.out.print("Enter task name: ");
				taskName = scnr.nextLine();
			} else if (userInput.equals("p")) {
				System.out.print("Enter task priority: ");
				taskPriority = scnr.nextInt();
				scnr.nextLine();
			} else if (userInput.equals("a")) {
				Task tempTask = new Task(taskName, taskPriority);
				queue.add(tempTask);
				System.out.println("Task added successfully");
			} else {
				if (userInput.equals("q")) {
					System.out.println("Quitting...");
					break;
				}
				System.out.println("Input " + userInput + " is not allowed please try again");
			}
		}
		
		
		System.out.println("Printing tasks...");
		for (Task task : queue) {
		    taskManager.add(task);
		}

		
		System.out.print(taskManager.printList());
		
		scnr.close();

	}

}
