package cn.uc.yqb.pojo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TComment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_comment", catalog = "yiqibang1")
public class TComment implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer TNId;
	private Integer TUId;
	private String CContent;
	private Date CCreatetime;
	private Integer CThumbscount;

	// Constructors

	/** default constructor */
	public TComment() {
	}

	/** minimal constructor */
	public TComment(Date CCreatetime) {
		this.CCreatetime = CCreatetime;
	}

	/** full constructor */
	public TComment(Integer TNId, Integer TUId, String CContent,
			Date CCreatetime, Integer CThumbscount) {
		this.TNId = TNId;
		this.TUId = TUId;
		this.CContent = CContent;
		this.CCreatetime = CCreatetime;
		this.CThumbscount = CThumbscount;
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

	@Column(name = "t_n_id")
	public Integer getTNId() {
		return this.TNId;
	}

	public void setTNId(Integer TNId) {
		this.TNId = TNId;
	}

	@Column(name = "t_u_id")
	public Integer getTUId() {
		return this.TUId;
	}

	public void setTUId(Integer TUId) {
		this.TUId = TUId;
	}

	@Column(name = "c_content", length = 200)
	public String getCContent() {
		return this.CContent;
	}

	public void setCContent(String CContent) {
		this.CContent = CContent;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "c_createtime", nullable = false, length = 10)
	public Date getCCreatetime() {
		return this.CCreatetime;
	}

	public void setCCreatetime(Date CCreatetime) {
		this.CCreatetime = CCreatetime;
	}

	@Column(name = "c_thumbscount")
	public Integer getCThumbscount() {
		return this.CThumbscount;
	}

	public void setCThumbscount(Integer CThumbscount) {
		this.CThumbscount = CThumbscount;
	}

}