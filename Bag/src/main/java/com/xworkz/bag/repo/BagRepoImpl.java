package com.xworkz.bag.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.bag.dto.BagDto;

@Repository
public class BagRepoImpl implements BagRepo {

	public BagRepoImpl() {
		System.out.println("created" + this.getClass().getSimpleName());

	}

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Override
	public String save(BagDto dto) {
		if (entityManagerFactory != null) {

			EntityManager em = entityManagerFactory.createEntityManager();
			em.getTransaction().begin();
			em.persist(dto);
			em.getTransaction().commit();
			return "Success";
		}

		return null;
	}

}
