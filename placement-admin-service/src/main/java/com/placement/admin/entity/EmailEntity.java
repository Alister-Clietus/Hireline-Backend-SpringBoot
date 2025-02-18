package com.placement.admin.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Emails")
public class EmailEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "mail_id", length = 255)
    private String mailId;

    @Column(name = "subject", length = 255)
    private String subject;

    @Column(name = "sender_id", length = 255)
    private String senderId;

    @Lob
    @Column(name = "content")
    private byte[] content;

    @Lob
    @Column(name = "links")
    private String links;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }
}
