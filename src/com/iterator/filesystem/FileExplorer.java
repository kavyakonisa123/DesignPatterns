package com.iterator.filesystem;

public class FileExplorer {
	  private FileCollection localFiles;
	    private FileCollection cloudFiles;

	    public FileExplorer(FileCollection localFiles, FileCollection cloudFiles) {
	        this.localFiles = localFiles;
	        this.cloudFiles = cloudFiles;
	    }

	    public void displayFiles() {
	        System.out.println("Local Files:");
	        printFiles(localFiles.createIterator());

	        System.out.println("\nCloud Files:");
	        printFiles(cloudFiles.createIterator());
	    }

	    private void printFiles(FileIterator iterator) {
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }

}
