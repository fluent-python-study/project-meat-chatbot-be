package com.project.meat.chatbot.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class MessageDto {
    private String content;
    private String writer;
    private LocalDateTime created_at;
}
