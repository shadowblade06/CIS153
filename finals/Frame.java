package finals;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.PriorityQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
		setTitle("Task GUI");
		setLayout(new FlowLayout());
		
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
		
		if (source == submit) {
			Task newTask = new Task(taskField.getText(), Integer.parseInt(priorityField.getText()));
			queue.add(newTask);
			taskField.setText("Enter a string");
			priorityField.setText("Enter a int");
		} else if (source == print) {
			for (Task task : queue) {
			    taskManager.add(task);
			}
			
			taskListField.setText(taskManager.printList());
			
		}
		
	}

}
