package com.example.demo.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import javax.persistence.Table;

import com.example.demo.entities.FirstEntity.FirstEntityId;

@Entity
@Table(name = "firstEntity")
public class FirstEntity extends AbstractEmbeddedIdEntity<FirstEntityId> {

	private static final long serialVersionUID = -5771103361843301446L;

	public FirstEntity() {
	}

	@Embeddable
	public static class FirstEntityId implements Serializable {
		private static final long serialVersionUID = -3906287313997919890L;
		@Column(name = "firstId")
		private String firstId;

		public FirstEntityId() {
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == this) {
				return true;
			}
			if (!(obj instanceof FirstEntityId)) {
				return false;
			}
			FirstEntityId other = (FirstEntityId) obj;
			return 
					Objects.equals(firstId, other.firstId);
		}

		@Override
		public int hashCode() {
			return Objects.hash(firstId);
		}
	}

	@Override
	protected FirstEntityId newId() {
		return new FirstEntityId();
	}

}