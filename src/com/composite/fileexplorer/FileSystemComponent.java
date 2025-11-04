package com.composite.fileexplorer;

interface FileSystemComponent {
    void showDetails(String indent);
    void open();
    int getSize(); 
    void delete();
}