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
 * TUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_user", catalog = "yiqibang1")
public class TUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private String UUsername;
	private String UNickname;
	private String UPassword;
	private Boolean USex;
	private String UBindtel;
	private String UEmail;
	private String UHeadimg;
	private Boolean UState;
	private Date UCreatetime;
	private Date UBirthday;
	private String URemark;
	private Date UUpdate;
	private Integer UProvinceid;
	private Integer UCityid;
	private Integer UAreaid;

	// Constructors

	/** default constructor */
	public TUser() {
	}

	/** minimal constructor */
	public TUser(String UUsername, String UPassword) {
		this.UUsername = UUsername;
		this.UPassword = UPassword;
	}

	/** full constructor */
	public TUser(String UUsername, String UNickname, String UPassword,
			Boolean USex, String UBindtel, String UEmail, String UHeadimg,
			Boolean UState, Date UCreatetime, Date UBirthday, String URemark,
			Date UUpdate, Integer UProvinceid, Integer UCityid, Integer UAreaid) {
		this.UUsername = UUsername;
		this.UNickname = UNickname;
		this.UPassword = UPassword;
		this.USex = USex;
		this.UBindtel = UBindtel;
		this.UEmail = UEmail;
		this.UHeadimg = UHeadimg;
		this.UState = UState;
		this.UCreatetime = UCreatetime;
		this.UBirthday = UBirthday;
		this.URemark = URemark;
		this.UUpdate = UUpdate;
		this.UProvinceid = UProvinceid;
		this.UCityid = UCityid;
		this.UAreaid = UAreaid;
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

	@Column(name = "u_username", nullable = false, length = 100)
	public String getUUsername() {
		return this.UUsername;
	}

	public void setUUsername(String UUsername) {
		this.UUsername = UUsername;
	}

	@Column(name = "u_nickname", length = 100)
	public String getUNickname() {
		return this.UNickname;
	}

	public void setUNickname(String UNickname) {
		this.UNickname = UNickname;
	}

	@Column(name = "u_password", nullable = false, length = 200)
	public String getUPassword() {
		return this.UPassword;
	}

	public void setUPassword(String UPassword) {
		this.UPassword = UPassword;
	}

	@Column(name = "u_sex")
	public Boolean getUSex() {
		return this.USex;
	}

	public void setUSex(Boolean USex) {
		this.USex = USex;
	}

	@Column(name = "u_bindtel", length = 20)
	public String getUBindtel() {
		return this.UBindtel;
	}

	public void setUBindtel(String UBindtel) {
		this.UBindtel = UBindtel;
	}

	@Column(name = "u_email", length = 30)
	public String getUEmail() {
		return this.UEmail;
	}

	public void setUEmail(String UEmail) {
		this.UEmail = UEmail;
	}

	@Column(name = "u_headimg", length = 100)
	public String getUHeadimg() {
		return this.UHeadimg;
	}

	public void setUHeadimg(String UHeadimg) {
		this.UHeadimg = UHeadimg;
	}

	@Column(name = "u_state")
	public Boolean getUState() {
		return this.UState;
	}

	public void setUState(Boolean UState) {
		this.UState = UState;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "u_createtime", length = 10)
	public Date getUCreatetime() {
		return this.UCreatetime;
	}

	public void setUCreatetime(Date UCreatetime) {
		this.UCreatetime = UCreatetime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "u_birthday", length = 10)
	public Date getUBirthday() {
		return this.UBirthday;
	}

	public void setUBirthday(Date UBirthday) {
		this.UBirthday = UBirthday;
	}

	@Column(name = "u_remark", length = 100)
	public String getURemark() {
		return this.URemark;
	}

	public void setURemark(String URemark) {
		this.URemark = URemark;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "u_update", length = 10)
	public Date getUUpdate() {
		return this.UUpdate;
	}

	public void setUUpdate(Date UUpdate) {
		this.UUpdate = UUpdate;
	}

	@Column(name = "u_provinceid")
	public Integer getUProvinceid() {
		return this.UProvinceid;
	}

	public void setUProvinceid(Integer UProvinceid) {
		this.UProvinceid = UProvinceid;
	}

	@Column(name = "u_cityid")
	public Integer getUCityid() {
		return this.UCityid;
	}

	public void setUCityid(Integer UCityid) {
		this.UCityid = UCityid;
	}

	@Column(name = "u_areaid")
	public Integer getUAreaid() {
		return this.UAreaid;
	}

	public void setUAreaid(Integer UAreaid) {
		this.UAreaid = UAreaid;
	}

}