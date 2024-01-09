package edu.example.java_classes.source;

import edu.example.java_classes.entity.Notebook;

public class NoteBookProvider {
	private static NoteBookProvider instance = null;

	private Notebook noteBook;

	private NoteBookProvider() {
		noteBook = new Notebook();
	}

	public static NoteBookProvider getInstance() {
		if (instance == null) {
			instance = new NoteBookProvider();
		}

		return instance;
	}

	public Notebook getNotebook() {
		return noteBook;
	}
}
