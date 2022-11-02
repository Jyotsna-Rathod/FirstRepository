package com.cjc.in.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.in.model.Documents;
import com.cjc.in.repository.DocumentsRepository;

@Service
public class DocumentsServiceImpl implements DocumentService {

	@Autowired
	private DocumentsRepository docRepo;

	@Override
	public Documents saveDocument(Documents doc) {
		Documents savedDoc = docRepo.save(doc);
		return savedDoc;
	}

}
