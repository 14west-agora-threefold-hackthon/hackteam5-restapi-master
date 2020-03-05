package com.agora.hackathon.team5.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.agora.hackathon.team5.model.Content;
import com.agora.hackathon.team5.repository.ContentRepository;
import org.apache.commons.lang.math.RandomUtils;

@Service
public class ContentServiceImpl implements ContentService {

	private ContentRepository contentRepository;

	public ContentServiceImpl(ContentRepository contentRepository){
		this.contentRepository = contentRepository;
	}

	@Override
	public List<Content> getContentByPubCode(String pubCode) {
		return contentRepository.findByPubCode(pubCode);
	}

	@Override
	public List<Content> findAllContent() {
		
		contentRepository.save(new Content(RandomUtils.nextLong(), "tst_title", "tst_content", "tst_pubcde"));
		
		return contentRepository.findAll();
	}

	@Override
	public void deleteAllContent() {
		contentRepository.deleteAll();
	}

	@Override
	public void deleteContentById(Long id) {
		contentRepository.deleteById(id);
	}

}
