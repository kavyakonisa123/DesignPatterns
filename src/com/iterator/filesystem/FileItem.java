package com.iterator.filesystem;

class FileItem {
    private String name;
    private long size;

    public FileItem(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public String getName() { return name; }
    public long getSize() { return size; }

    @Override
    public String toString() {
        return name + " (" + size + " KB)";
    }
}
