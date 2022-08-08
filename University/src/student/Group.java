package student;

import java.util.ArrayList;

public class Group {
	
	private String groupName;
	private int course;
	private ArrayList<Student> student;
	private Teacher teacher;
	
	public Group (String groupName, int course, Student student, Teacher teacher) {
		this.groupName = groupName;
		this.course = course;
		this.teacher = teacher;
	}
	
	public void setGroupName (String groupName) {
		this.groupName = groupName;
	}
	
	public String getGroupName () {
		return this.groupName;
	}
	
	public void setCourse (int course) {
		this.course = course;
	}
	
	public int getCourse () {
		return this.course;
	}

	public void setTeacher (Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Teacher getTeacher () {
		return this.teacher;
	}
	
	public void addStudent (Student newStudent) {
		student.add (newStudent);
	}
	
	public String toString () {
		return this.groupName + " " + this.course + " " + this.student + " " + this.teacher;
	}
}
