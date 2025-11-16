package com.proxy.virtual.imageloading;

public class Client {
	    public static void main(String[] args) {
	        Image img1 = new ProxyImage("https://m.media-amazon.com/images/I/41Qcf84mmvL._AC_UF350,350_QL80_.jpg");
	        Image img2 = new ProxyImage("https://m.media-amazon.com/images/I/81iAn8ChDHL._AC_UF1000,1000_QL80_.jpg");

	        System.out.println("Displaying first image:");
	        img1.display(); // Loads image now

	        System.out.println("\nDisplaying first image again:");
	        img1.display(); // Uses already loaded image

	        System.out.println("\nDisplaying second image:");
	        img2.display(); // Loads second image now
	    }
	}


