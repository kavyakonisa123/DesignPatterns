package com.iterator.filesystem;

import java.util.*;

class LocalFileCollection implements FileCollection {
    private List<FileItem> localFiles = new ArrayList<>();

    public LocalFileCollection() {
        localFiles.add(new FileItem("photo.jpg", 1200));
        localFiles.add(new FileItem("notes.txt", 25));
        localFiles.add(new FileItem("report.pdf", 300));
    }

    @Override
    public FileIterator createIterator() {
        return new LocalFileIterator(localFiles);
    }
}