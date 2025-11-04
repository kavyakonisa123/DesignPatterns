package com.composite.fileexplorer;

//Client
public class FileExplorerDemo {
 public static void main(String[] args) {
     // Leaf nodes
	 File resume = new File("Resume.pdf", 120);
     File photo = new File("Photo.jpg", 540);
     File notes = new File("Notes.txt", 80);
     File video = new File("Lecture.mp4", 2048);

     // Composite directories
     Directory documents = new Directory("Documents");
     Directory pictures = new Directory("Pictures");
     Directory videos = new Directory("Videos");
     Directory downloads = new Directory("Downloads");
     Directory root = new Directory("Root");

  // Build hierarchy
     documents.add(resume);
     documents.add(notes);

     pictures.add(photo);
     videos.add(video);

     root.add(documents);
     root.add(downloads);
     downloads.add(pictures);
     downloads.add(videos);

     // Display structure
     System.out.println("File Explorer Structure:");
     root.showDetails("");

     // Opening root directory
     System.out.println("\nOpening Root Directory:");
     root.open();

     // Calculate total size
     System.out.println("\nTotal size of Root: " + root.getSize() + " KB");

     // Delete operation
     System.out.println("\nDeleting the Documents folder:");
     documents.delete();

     System.out.println("\nUpdated Structure After Deletion:");
     root.showDetails("");
 }
}