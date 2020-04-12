package com.sk.exammvc.service;

import com.sk.exammvc.entity.Replay;
import com.sk.exammvc.mapper.ReplayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplayService {

    @Autowired
    private ReplayMapper replayMapper;

    public List<Replay> findAll() {
        return replayMapper.findAll();
    }

    public List<Replay> findAllById(Integer messageId) {
        return replayMapper.findAllById(messageId);
    }

    public Replay findById(Integer replayId) {
        return replayMapper.findById(replayId);
    }

    public int delete(Integer replayId) {
        return replayMapper.delete(replayId);
    }

    public int update(Replay replay) {
        return replayMapper.update(replay);
    }

    public int add(Replay replay) {
        return replayMapper.add(replay);
    }
}
