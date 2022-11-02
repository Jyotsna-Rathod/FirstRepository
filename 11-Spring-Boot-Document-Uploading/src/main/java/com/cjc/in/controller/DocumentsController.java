package com.cjc.in.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.in.model.Documents;
import com.cjc.in.service.DocumentService;

@RestController
@RequestMapping("/docApi")
public class DocumentsController {
	
	@Autowired
	private DocumentService docService;
	
	@PostMapping("/saveDocuments")
	public ResponseEntity<String> saveDocument(
			@RequestPart MultipartFile f1,
			@RequestPart MultipartFile f2,
			@RequestPart MultipartFile f3,
			@RequestPart MultipartFile f4,
			@RequestPart MultipartFile f5
			
			)throws IOException{
		
		Documents doc = new Documents();
		doc.setAdhar(f1.getBytes());
		doc.setPan(f2.getBytes());
		doc.setVoterId(f3.getBytes());
		doc.setSign(f4.getBytes());
		doc.setPhoto(f5.getBytes());
		docService.saveDocument(doc);
		return new ResponseEntity<String>("Created!!!",HttpStatus.CREATED);
		
	}
}
