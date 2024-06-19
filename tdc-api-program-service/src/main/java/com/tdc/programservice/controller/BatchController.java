package com.tdc.programservice.controller;
import com.tdc.programservice.entity.Batch;
import com.tdc.programservice.entity.Course;
import com.tdc.programservice.service.BatchService;
import com.tdc.programservice.service.impl.BatchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("api/batch")
public class BatchController{
    @Autowired
    private BatchService batchService;
    @GetMapping
    public ResponseEntity<List<Batch>> getAllBatch(){
        List<Batch> batchList = batchService.getAllBatch();
        return new ResponseEntity<>(batchList, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Batch> getBatchById(@PathVariable int id){
        return batchService.getBatchById(id)
                .map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.notFound().build());
    }
}
