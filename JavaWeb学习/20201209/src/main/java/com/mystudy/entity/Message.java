package com.mystudy.entity;

public class Message {
    private int id;
    private String who;
    private String when;
    private String what;

    public Message() {
    }

    public Message(int id, String who, String when, String where) {
        this.id = id;
        this.who = who;
        this.when = when;
        this.what = where;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getWhen() {
        return when;
    }

    public void setWhen(String when) {
        this.when = when;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String where) {
        this.what = where;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", who='" + who + '\'' +
                ", when='" + when + '\'' +
                ", what='" + what + '\'' +
                '}';
    }
}
