package edu.example.java_classes.start;

import java.util.List;

import edu.example.java_classes.entity.Note;
import edu.example.java_classes.logic.NotebookLogic;
import edu.example.java_classes.output.NotebookOutput;

public class Main {
	public static void main(String[] args) {

		NotebookLogic logic = new NotebookLogic();

		logic.add("title1", "content1");
		logic.add("title2", "content2");
		logic.add("title3", "content3");

		List<Note> myNotes = logic.allNotes();

		NotebookOutput output = new NotebookOutput();

		output.print("all notes", myNotes);
	}
}