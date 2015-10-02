package model;
 
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
 
 
/**
 *
 * The persistent class for the driver database table. 
 * 
 */
//@NamedQuery(name="MagicObj.findAll", query="SELECT Id,Comment  FROM magic_obj m")
@Entity
@Table(name="magic_obj")
public class MagicObj implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="Id", unique=true, nullable=false, length=15)
    private Integer id;
    @Column(name="Comment", length=255)
    private String comment;
    @Column(name="moretext", length=1000)
    private String moreText;
    @Column(name="mydate")
    private Date myDate;
    @Column(name="istrue")
    private boolean isTrue;
   
 
    public MagicObj() {
    }
 
 
   	/**
	 * @return the isTrue
	 */
	public Boolean getIsTrue() {
		return isTrue;
	}

	/**
	 * @param isTrue the isTrue to set
	 */
	public void setIsTrue(Boolean isTrue) {
		this.isTrue = isTrue;
	}
 
   
    public String getComment() {
        return this.comment;
    }

 
    public String getMoreText() {
        return this.moreText;
    }
    
 
    public Date getMyDate() {
        return this.myDate;
    }   
 
  public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }

  public void setMoreText(String moreText) {
        this.moreText = moreText;
    }
 

    public void setComment(String comment) {
        this.comment = comment;
    }
 
    
    public Integer getId() {
        return this.id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
 
  
 
}
