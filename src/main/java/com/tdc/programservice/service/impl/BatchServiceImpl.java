package com.tdc.programservice.service.impl;
import com.tdc.programservice.entity.Batch;
import com.tdc.programservice.repository.BatchRepository;
import com.tdc.programservice.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BatchServiceImpl implements BatchService{
    @Autowired
    private BatchRepository batchRepository;
    @Override
    public List<Batch> getAllBatch() {
        return batchRepository.findAll();
    }

    @Override
    public Optional<Batch> getBatchById(int batch_id) {
        return batchRepository.findById(batch_id);
    };
    }
