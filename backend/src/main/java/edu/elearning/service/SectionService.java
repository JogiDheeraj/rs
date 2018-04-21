package edu.elearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.elearning.model.Section;
import edu.elearning.repo.SectionRepository;
import edu.elearning.util.CompositeKey;

@Service
public class SectionService extends UUIDService {

	@Autowired
	private SectionRepository sectionRepository;

	public void save(Section section) {
		if (isNew(section)) {
			generateId(section);
		}
		sectionRepository.save(section);
	}

	public List<Section> findParentId(String parentId) {
		return sectionRepository.findParentId(parentId);
	}

	public Section findOneBySeoName(String seoName) {
		return sectionRepository.findOneBySeoName(seoName);
	}

	public void delete(CompositeKey id) {
		sectionRepository.delete(id);
	}

	public Section findOne(CompositeKey sectionid) {
		return sectionRepository.findOne(sectionid);
	}

}
