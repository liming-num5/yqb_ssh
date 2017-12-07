package cn.uc.yqb.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Areas entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "areas", catalog = "yiqibang1")
public class Areas implements java.io.Serializable {

	// Fields

	private Integer id;
	private String areaid;
	private String area;
	private String cityid;
	private Integer version;

	// Constructors

	/** default constructor */
	public Areas() {
	}

	/** minimal constructor */
	public Areas(String areaid, String area, String cityid) {
		this.areaid = areaid;
		this.area = area;
		this.cityid = cityid;
	}

	/** full constructor */
	public Areas(String areaid, String area, String cityid, Integer version) {
		this.areaid = areaid;
		this.area = area;
		this.cityid = cityid;
		this.version = version;
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

	@Column(name = "areaid", nullable = false, length = 20)
	public String getAreaid() {
		return this.areaid;
	}

	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}

	@Column(name = "area", nullable = false, length = 50)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "cityid", nullable = false, length = 20)
	public String getCityid() {
		return this.cityid;
	}

	public void setCityid(String cityid) {
		this.cityid = cityid;
	}

	@Column(name = "version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}