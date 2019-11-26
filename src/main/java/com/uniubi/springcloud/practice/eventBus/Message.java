package com.uniubi.springcloud.practice.eventBus;

/**
 * @Auther: jerry.feng
 * @Date: 2019/8/22
 * @Description:
 */
public class Message {
    private MessageType messageType;
    private String messageContent;

    public Message(MessageType messageType, String messageContent) {
        this.messageType = messageType;
        this.messageContent = messageContent;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }


    public enum MessageType {
        OPENDOOR(1, "openDoor"),
        CLOSEDOOR(2,"closeDoor");


        private int code;
        private String value;

        MessageType(int code, String value) {
            this.code = code;
            this.value = value;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        }
}
