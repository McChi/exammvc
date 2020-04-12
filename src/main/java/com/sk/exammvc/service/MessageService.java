package com.sk.exammvc.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sk.exammvc.entity.Message;
import com.sk.exammvc.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private MessageMapper messageMapper;

    public IPage<Message> findAll(Page page) {
        return messageMapper.findAll(page);
    }

    public Message findById(Integer id) {
        return messageMapper.findById(id);
    }

    public int delete(Integer id) {
        return messageMapper.delete(id);
    }

    public int update(Message message) {
        return messageMapper.update(message);
    }

    public int add(Message message) {
        return messageMapper.add(message);
    }
}
