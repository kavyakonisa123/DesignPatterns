package com.composite.fileexplorer;

class File implements FileSystemComponent {
	private String name;
	private int size; // in KB

	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public void showDetails(String indent) {
		System.out.println(indent + "- File: " + name + " (" + size + " KB)");
	}

	@Override
	public void open() {
		System.out.println(" Opening file: " + name);
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void delete() {
		System.out.println("Deleting file: " + name);
	}
}