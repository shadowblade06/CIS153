package finals;

import java.awt.FlowLayout; // This is used to format the labels and text fields and buttons
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // This is used to listen for a button press then runs code to change parts of the GUI
import java.util.PriorityQueue; // This is the priority queue for the tasks before they are added to taskManager

import javax.swing.JButton; // JButtons allow the GUI to be interactive
import javax.swing.JFrame; // This is the main frame import
import javax.swing.JLabel; // JLabels allow for text to tell the user what the fields are for
import javax.swing.JTextField; // JTextFields allow for the user to enter inputs for the GUI to read

public class Frame extends JFrame implements ActionListener {
	PriorityQueue<Task> queue = new PriorityQueue<Task>();
	TaskManager<Task> taskManager = new TaskManager<Task>();
	private JLabel taskLabel;
	private JLabel priorityLabel;
	private JLabel taskListLabel;
	private JTextField taskField;
	private JTextField priorityField;
	private JTextField taskListField;
	private JButton submit;
	private JButton print;
	
	public Frame() {
		// adding the title and the layout to the frame
		setTitle("Task GUI");
		setLayout(new FlowLayout());
		
		// initializing each component
		taskLabel = new JLabel("Enter task name:");
		priorityLabel = new JLabel("Enter priority level:");
		taskListLabel = new JLabel("Task List:");
		
		taskField = new JTextField(15);
		taskField.setEditable(true);
		taskField.setText("Enter a string");
		
		priorityField = new JTextField(15);
		priorityField.setEditable(true);
		priorityField.setText("Enter a int");
		
		taskListField = new JTextField(100);
		taskListField.setEditable(false);
		
		submit = new JButton("Submit");
		submit.addActionListener(this);
		
		print = new JButton("Print");
		print.addActionListener(this);
		
		// adding all the components
		add(taskLabel);
		add(taskField);
		add(priorityLabel);
		add(priorityField);
		add(taskListLabel);
		add(taskListField);
		add(submit);
		add(print);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if (source == submit) { // creates a new task then adds it to the queue with the inputs from the gui
			Task newTask = new Task(taskField.getText(), Integer.parseInt(priorityField.getText()));
			queue.add(newTask);
			taskField.setText("Enter a string");
			priorityField.setText("Enter a int");
		} else if (source == print) { // adds the tasks in the queue to the task manager then prints the list to the field
			for (Task task : queue) {
			    taskManager.add(task);
			}
			
			taskListField.setText(taskManager.printList());
			
		}
		
	}

}
