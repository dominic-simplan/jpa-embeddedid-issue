package com.example.demo.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.demo.entities.SecondEntity.SecondEntityId;

@Entity
@Table(name = "secondEntity")
public class SecondEntity extends AbstractEmbeddedIdEntity<SecondEntityId> {

	private static final long serialVersionUID = -9176028203802493181L;

	public SecondEntity() {
	}

	@Embeddable
	public static class SecondEntityId implements Serializable {
		
		private static final long serialVersionUID = -6222219927968609616L;
		@Column(name = "secondId")
		private String secondId;

		public SecondEntityId() {
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == this) {
				return true;
			}
			if (!(obj instanceof SecondEntityId)) {
				return false;
			}
			SecondEntityId other = (SecondEntityId) obj;
			return Objects.equals(secondId, other.secondId);
		}

		@Override
		public int hashCode() {
			return Objects.hash(secondId);
		}
	}

	@Override
	protected SecondEntityId newId() {
		return new SecondEntityId();
	}

}