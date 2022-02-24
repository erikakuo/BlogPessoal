package org.generation.BlogPessoal.repository;

import java.util.List;

import org.generation.BlogPessoal.model.PostagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long> {
public List <PostagemModel>findAllByTituloContainingIgnoreCase(String titulo);
}
