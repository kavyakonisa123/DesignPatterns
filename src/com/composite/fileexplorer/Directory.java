package com.composite.fileexplorer;

import java.util.ArrayList;
import java.util.List;
//Composite
class Directory implements FileSystemComponent {
	private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent + "+ Directory: " + name);
        for (FileSystemComponent c : components) {
            c.showDetails(indent + "   ");
        }
    }

    @Override
    public void open() {
        System.out.println("Opening directory: " + name);
        for (FileSystemComponent c : components) {
            c.open();
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemComponent c : components) {
            totalSize += c.getSize();
        }
        return totalSize;
    }

    @Override
    public void delete() {
        System.out.println("Deleting directory: " + name);
        for (FileSystemComponent c : components) {
            c.delete();
        }
        components.clear(); // remove all after deletion
    }
}