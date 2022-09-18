package com.blogtijacque.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.blogtijacque.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

    /**
	 * Method Query equivalente a instrução SQL: 
	 * 
	 * SELECT * FROM tb_postagem where titulo like "%titulo%";
	 */
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);

}
