package com.intuit.fm.vinod.protobuf.demoprotobuf;


import lombok.Data;

@Data
public class MessageJson {
    private String id;
    private String content;

    public MessageJson(String id, String content) {
        this.id = id;
        this.content = content;
    }


}

