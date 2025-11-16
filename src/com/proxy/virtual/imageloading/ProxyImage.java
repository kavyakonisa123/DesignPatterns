package com.proxy.virtual.imageloading;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {

        // Create real object only when needed
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }

        realImage.display();
    }
}
