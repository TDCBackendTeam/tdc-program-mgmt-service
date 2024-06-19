package com.tdc.programservice.service;

import com.tdc.programservice.entity.Batch;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface BatchService
{
List<Batch> getAllBatch();

Optional<Batch> getBatchById(int batch_id);


}
