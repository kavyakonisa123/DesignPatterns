package com.iterator.filesystem;

import java.util.List;

public class LocalFileIterator implements FileIterator {
	 private List<FileItem> files;
	 private int index = 0;

	public LocalFileIterator(List<FileItem> files) {
        this.files = files;
    }

    public boolean hasNext() {
        return index < files.size();
    }

    public FileItem next() {
        return files.get(index++);
    }
    
	public void remove() {
		throw new UnsupportedOperationException("You shouldn't be trying to remove the operation");

	}

}
