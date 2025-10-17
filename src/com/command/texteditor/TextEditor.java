package com.command.texteditor;

// Step 2: Receiver
class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void addText(String newText) {
        text.append(newText);
        System.out.println("Added text: " + newText);
    }

    public void deleteLast(int length) {
        int start = text.length() - length;
        if (start >= 0) {
            text.delete(start, text.length());
            System.out.println(" Deleted last " + length + " characters");
        }
    }

    public String getText() {
        return text.toString();
    }
}

