package ar.com.afip.webmessages.model;

import java.time.LocalDateTime;


public class Message {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSender() {
        return sender;
    }

    public void setSender(int sender) {
        this.sender = sender;
    }

    public int getRecipient() {
        return recipient;
    }

    public void setRecipient(int recipient) {
        this.recipient = recipient;
    }

    public LocalDateTime getCreate() {
        return create;
    }

    public void setCreate(LocalDateTime create) {
        this.create = create;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Message(int id, int sender, int recipient, LocalDateTime create, String content) {
        this.id = id;
        this.sender = sender;
        this.recipient = recipient;
        this.create = create;
        this.content = content;
    }

    private int sender;
    private int recipient;
    private LocalDateTime create;
    private String content;

}

