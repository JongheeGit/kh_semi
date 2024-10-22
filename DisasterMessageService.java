package com.emerMsg.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DisasterMessageService {
    public String getMessagesByAddress(String address) {
        return address + " 지역에 재난문자가 없습니다.";
    }
}
