package com.iterator.filesystem;

public interface FileIterator {
	boolean hasNext();
	FileItem next();
	void remove();

}
