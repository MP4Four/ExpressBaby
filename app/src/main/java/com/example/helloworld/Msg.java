package com.example.helloworld;

public class Msg {
    public static final int TYPE_RECEIVED = 0;

    public static final int TYPE_SENT = 1;

    private String content;

    private int type;

    public Msg(String congtent, int type) {
        this.content = congtent;
        this.type = type;
    }

    public String getContent() {
        return  content;
    }

    public int getType() {
        return type;
    }
}
