package com.example.demo;

import com.example.demo.entities.FirstEntity;
import com.example.demo.entities.FirstEntity.FirstEntityId;

/**
 * Repository for {@link FirstEntity} entities.
 */
public interface FirstEntityRepository extends EntityRepository<FirstEntity, FirstEntityId> {

	FirstEntity findFirstByIdFirstId(String customId);
}
