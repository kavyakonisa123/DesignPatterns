package com.iterator.filesystem;

public class CloudFileIterator implements FileIterator {
    private FileItem[] files;
    private int index = 0;

    public CloudFileIterator(FileItem[] files) {
        this.files = files;
    }

    public boolean hasNext() {
        return index < files.length && files[index] != null;
    }

    public FileItem next() {
        return files[index++];
    }

    public void remove() {
		throw new UnsupportedOperationException("You shouldn't be trying to remove the operation");

	}

}
