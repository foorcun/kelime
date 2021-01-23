package com.troyatech.kelime.DataAccess;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.troyatech.kelime.model.Kelime;
import com.troyatech.kelime.repository.KelimeRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class DataAccessTest {

	
	@Autowired
	private KelimeRepository repo;
	
	
	
	@Test
	public void testFindProductByNameExist() {
		
		String ger = "iPhone 11";
		Kelime product = repo.findByGer(ger);
		
		assertNull(product);
		
	}
	
	@Test
	public void testFindProductByIdExist() {
		
		String id = "1";
		Kelime product = repo.findById(id);
		
//		System.out.println(product.getId());
		
//		assertNotNull(product);
		assertEquals(product.getId(),id);
		
	}
	
}
