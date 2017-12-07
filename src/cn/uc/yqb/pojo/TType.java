package cn.uc.yqb.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TType entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_type", catalog = "yiqibang1")
public class TType implements java.io.Serializable {

	// Fields

	private Integer id;
	private String TName;

	// Constructors

	/** default constructor */
	public TType() {
	}

	/** full constructor */
	public TType(String TName) {
		this.TName = TName;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "t_name", length = 20)
	public String getTName() {
		return this.TName;
	}

	public void setTName(String TName) {
		this.TName = TName;
	}

}