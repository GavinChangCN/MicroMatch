package MicroMatch.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BgGsubject entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "Subject", schema = "", catalog = "micromatch")
public class SubjectEntity implements java.io.Serializable {

	// Fields

	private Integer id;
	private String subjectName;
	private String remark="空";
	private Integer pid=0;

	// Constructors

	/** default constructor */
	public SubjectEntity() {
	}

	/** full constructor */
	public SubjectEntity(String subjectName, String remark, Integer pid) {
		this.subjectName = subjectName;
		this.remark = remark;
		this.pid = pid;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "ID", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "SubjectName", length = 20)
	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Column(name = "Remark", length = 50)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column(name = "PID")
	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

}
