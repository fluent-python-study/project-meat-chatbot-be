package com.project.meat.chatbot.controller;

import com.project.meat.chatbot.dto.MessageDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Api(tags = {"message"}, value = "메시지 관련 API")
@RestController
public class MessageController {

    @GetMapping(value = "/messages")
    @ApiOperation(value = "메시지 목록 API", notes = "분석 대상 메시지 목록을 가져오는 API")
    public List<MessageDto> getRawMessages() {
        List<MessageDto> rawMessages = new ArrayList<MessageDto>();
        MessageDto sampleMessage = new MessageDto();
        sampleMessage.setContent("테스트 메시지입니다.");
        sampleMessage.setWriter("테스트 사용자");
        sampleMessage.setCreated_at(LocalDateTime.now());
        rawMessages.add(sampleMessage);

        return rawMessages;
    }

    // TODO
}
