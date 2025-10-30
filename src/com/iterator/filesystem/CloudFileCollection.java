package com.iterator.filesystem;

class CloudFileCollection implements FileCollection {
    private FileItem[] cloudFiles;
    private int count = 0;

    public CloudFileCollection() {
        cloudFiles = new FileItem[5];
        addFile(new FileItem("presentation.pptx", 5000));
        addFile(new FileItem("design.psd", 3200));
    }

    public void addFile(FileItem item) {
        cloudFiles[count++] = item;
    }

    @Override
    public FileIterator createIterator() {
        return new CloudFileIterator(cloudFiles);
    }
}