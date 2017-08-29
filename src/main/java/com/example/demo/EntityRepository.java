package com.example.demo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.example.demo.entities.AbstractEntity;

/**
 * Basic repository class for {@link AbstractEntity}s.
 * 
 * @param <T>
 *            The entity handled by this repository
 * @param <ID>
 *            The type of the id of the entity handled by this repository
 */
@NoRepositoryBean
public interface EntityRepository<T extends AbstractEntity<ID>, ID extends Serializable> extends JpaRepository<T, ID> {

}
