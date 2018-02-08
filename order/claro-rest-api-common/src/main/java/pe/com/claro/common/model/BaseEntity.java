package pe.com.claro.common.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.springframework.format.annotation.DateTimeFormat;


@MappedSuperclass
public class BaseEntity implements Comparable<BaseEntity>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "createdBy")
	private String createdBy;

	@Column(name = "createdDate")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime", parameters = { @Parameter(name = "databaseZone", value = "jvm") })
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private DateTime createdDate;

	@Column(name = "lastModifiedBy")
	private String lastModifiedBy;

	@Column(name = "lastModifiedDate")
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime", parameters = { @Parameter(name = "databaseZone", value = "jvm") })
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private DateTime lastModifiedDate;

	@Column(name = "deleted")
	private boolean deleted;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public DateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(DateTime createdDate) {
		this.createdDate = createdDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public DateTime getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(DateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
    public int compareTo(BaseEntity o) {
        return this.getId().compareTo(o.getId());
    }

    public boolean equals(Object other) {
        if (other == null || other.getClass() != this.getClass())
            return false;

        return this.getId().equals(((BaseEntity) other).getId());
    }



}