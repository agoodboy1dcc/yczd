package com.yczd.api.aio.good.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yczd.api.aio.good.domain.Good;
import com.yczd.api.aio.good.repository.GoodRepository;

@Service
public class GoodServiceImpl implements GoodService {

	@Autowired
	GoodRepository goodRepository;

	@Override
	public List<Good> findAll() {
		return goodRepository.findAll();
	}

	@Override
	public Good findById(String id) {
		return goodRepository.findById(id);
	}

	@Override
	public Good findByName(String name) {
		// TODO
		return goodRepository.findByName(name);
	}

	@Override
	public Good save(Good good) {
		// TODO
		if (good.getGoodId() == null) {
			Integer id = goodRepository.insert(good);
			good.setGoodId(id);
		} else {

		}
		return null;
	}

	@Override
	public void delete(Good good) {
		// TODO
	}

	@Override
	public void deleteById(String id) {
		// TODO

	}

}
