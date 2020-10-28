package br.gov.sp.fatec.backend.websocket;

import java.util.Date;

import br.gov.sp.fatec.backend.models.MessageType;

public class ChatMessage {
  private String text;
  private String sender;
  private String recipient;
  private Date timestamp;
  private MessageType type;

  public ChatMessage() {}

  public ChatMessage(String sender, MessageType type) {
    this.sender = sender;
    this.type = type;
    this.timestamp = new Date(System.currentTimeMillis());
  }

  public String getText() {
    return text;
  }

  public String getSender() {
    return sender;
  }

  public String getRecipient() {
    return recipient;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public MessageType getType() {
    return type;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public void setMessageType(MessageType type) {
    this.type = type;
  }
}