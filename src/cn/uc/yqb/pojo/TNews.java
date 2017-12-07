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
 * TNews entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_news", catalog = "yiqibang1")
public class TNews implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer TTId;
	private String NTitle;
	private String NSource;
	private String NContent;
	private Date NCreatetime;
	private Integer NCommcount;
	private Integer NReadcount;
	private String NAuthor;
	private Integer NSharecount;
	private Boolean NIfhot;
	private Boolean NIfreport;
	private String NPics;

	// Constructors

	/** default constructor */
	public TNews() {
	}

	/** full constructor */
	public TNews(Integer TTId, String NTitle, String NSource, String NContent,
			Date NCreatetime, Integer NCommcount, Integer NReadcount,
			String NAuthor, Integer NSharecount, Boolean NIfhot,
			Boolean NIfreport, String NPics) {
		this.TTId = TTId;
		this.NTitle = NTitle;
		this.NSource = NSource;
		this.NContent = NContent;
		this.NCreatetime = NCreatetime;
		this.NCommcount = NCommcount;
		this.NReadcount = NReadcount;
		this.NAuthor = NAuthor;
		this.NSharecount = NSharecount;
		this.NIfhot = NIfhot;
		this.NIfreport = NIfreport;
		this.NPics = NPics;
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

	@Column(name = "t_t_id")
	public Integer getTTId() {
		return this.TTId;
	}

	public void setTTId(Integer TTId) {
		this.TTId = TTId;
	}

	@Column(name = "n_title", length = 50)
	public String getNTitle() {
		return this.NTitle;
	}

	public void setNTitle(String NTitle) {
		this.NTitle = NTitle;
	}

	@Column(name = "n_source", length = 30)
	public String getNSource() {
		return this.NSource;
	}

	public void setNSource(String NSource) {
		this.NSource = NSource;
	}

	@Column(name = "n_content", length = 65535)
	public String getNContent() {
		return this.NContent;
	}

	public void setNContent(String NContent) {
		this.NContent = NContent;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "n_createtime", length = 10)
	public Date getNCreatetime() {
		return this.NCreatetime;
	}

	public void setNCreatetime(Date NCreatetime) {
		this.NCreatetime = NCreatetime;
	}

	@Column(name = "n_commcount")
	public Integer getNCommcount() {
		return this.NCommcount;
	}

	public void setNCommcount(Integer NCommcount) {
		this.NCommcount = NCommcount;
	}

	@Column(name = "n_readcount")
	public Integer getNReadcount() {
		return this.NReadcount;
	}

	public void setNReadcount(Integer NReadcount) {
		this.NReadcount = NReadcount;
	}

	@Column(name = "n_author", length = 100)
	public String getNAuthor() {
		return this.NAuthor;
	}

	public void setNAuthor(String NAuthor) {
		this.NAuthor = NAuthor;
	}

	@Column(name = "n_sharecount")
	public Integer getNSharecount() {
		return this.NSharecount;
	}

	public void setNSharecount(Integer NSharecount) {
		this.NSharecount = NSharecount;
	}

	@Column(name = "n_ifhot")
	public Boolean getNIfhot() {
		return this.NIfhot;
	}

	public void setNIfhot(Boolean NIfhot) {
		this.NIfhot = NIfhot;
	}

	@Column(name = "n_ifreport")
	public Boolean getNIfreport() {
		return this.NIfreport;
	}

	public void setNIfreport(Boolean NIfreport) {
		this.NIfreport = NIfreport;
	}

	@Column(name = "n_pics", length = 500)
	public String getNPics() {
		return this.NPics;
	}

	public void setNPics(String NPics) {
		this.NPics = NPics;
	}

}