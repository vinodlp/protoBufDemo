package com.intuit.fm.vinod.protobuf.demoprotobuf;

import com.example.protobuf.Message;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class MessageController {

    @GetMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public MessageJson getMessageAsJson() {
        return new MessageJson("1", "Hello, JSON!");
    }
    @GetMapping(value = "/message", produces = "application/x-protobuf")
    public Message message() {
        return Message.newBuilder()
                .setId("1")
                .setContent("Hello, Protobuf!")
                .build();
    }
}
