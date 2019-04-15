package com.app.models;

/*
 * User Object
 * @author Gary Sundquist
 */
import java.sql.Date;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import com.app.utils.JacksonUtils;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;
	
	@Column(name="name")
	@NotNull
    private String name;
	
	@Column(name="time_Played")
    private long timePlayed;
	
	@Column(name="last_Played")
	private Date lastPlayed;

	@JsonProperty("levels")
	@NotNull
	private String levels;
	
	@Column(name="last_updated")
	@NotNull
	private Date lastUpdated;
	
	@Transient
	private String fellowshipName;
	
	@JsonProperty("stats")
    private String stats;
	
	@Transient
	private String status;
	
    public String getStatus() {
        return status;
    }

	public void setStatus(String status) {
        this.status = status;
    }
	
    public Long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setCharacterName(String name) {
        this.name = name;
    }

    public long getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(Integer timePlayed) {
        this.timePlayed = timePlayed;
    }
    
    public Levels getLevels() {
        return JacksonUtils.getObj(levels, Levels.class);
    }
    public void setLevels(Levels levels) {
        this.levels = JacksonUtils.getObjString(levels);
    }
    
    public List<Stats> getStats() {
        return JacksonUtils.getObjLst(stats, Stats.class);
    }

    public void setStats(List<Stats> stats) {
        this.stats = JacksonUtils.getObjString(stats);
    }
     
    public Date getLastPlayed() {
    	return lastPlayed;
    }
    
    public void setLastPlayed(Date lastPlayed) {
    	this.lastPlayed = lastPlayed;
    }
    
    public Date getLastUpdated() {
    	return lastUpdated;
    }
    
    public void setLastUpdated(Date lastUpdated) {
    	this.lastUpdated = lastUpdated;
    }
    
	public String getFellowshipName() {
		return fellowshipName;
	}

	public void setFellowshipName(String fellowshipName) {
		this.fellowshipName = fellowshipName;
	}
    
    public String toString() {
        return "UserId: " + this.userId + ", Name: " + this.name.toString() + 
        		", timePlayed: " + this.timePlayed + ", Levels: " + 
        		this.levels.toString() + ", Stats: " + this.stats;
    }
}
