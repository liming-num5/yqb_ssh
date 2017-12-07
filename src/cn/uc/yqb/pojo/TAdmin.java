package cn.uc.yqb.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TAdmin entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_admin", catalog = "yiqibang1")
public class TAdmin implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer TUId;
	private Boolean UState;
	private Integer ULevel;

	// Constructors

	/** default constructor */
	public TAdmin() {
	}

	/** full constructor */
	public TAdmin(Integer TUId, Boolean UState, Integer ULevel) {
		this.TUId = TUId;
		this.UState = UState;
		this.ULevel = ULevel;
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

	@Column(name = "t_u_id")
	public Integer getTUId() {
		return this.TUId;
	}

	public void setTUId(Integer TUId) {
		this.TUId = TUId;
	}

	@Column(name = "u_state")
	public Boolean getUState() {
		return this.UState;
	}

	public void setUState(Boolean UState) {
		this.UState = UState;
	}

	@Column(name = "u_level")
	public Integer getULevel() {
		return this.ULevel;
	}

	public void setULevel(Integer ULevel) {
		this.ULevel = ULevel;
	}

}