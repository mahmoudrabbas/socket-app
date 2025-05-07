package com.socket.model;

public class ChatMessage {
    private String message;
    private String sender;
    private ChatType type;

    public ChatMessage() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public ChatType getType() {
        return type;
    }

    public void setType(ChatType type) {
        this.type = type;
    }
}


enum ChatType {
    JOIN,
    LEAVE,
    CHAT
}
