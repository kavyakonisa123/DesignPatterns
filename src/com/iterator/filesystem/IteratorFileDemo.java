package com.iterator.filesystem;

public class IteratorFileDemo {
	    public static void main(String[] args) {
	        FileCollection local = new LocalFileCollection();
	        FileCollection cloud = new CloudFileCollection();

	        FileExplorer explorer = new FileExplorer(local, cloud);
	        explorer.displayFiles();
	    }
}
