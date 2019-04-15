package com.OrbusVR.models;

import java.sql.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long userId;
	
	@Column(name="name")
    private String characterName;
	
	@Column(name="time_Played")
    private long timePlayed;
	
	@Column(name="last_Played")
	private Date lastPlayed;
	
	@Column(name="fellowship_id")
    private Integer fellowshipName;
	
	@Column(name="stats")
	private String statsJson;
	
	@Column(name="levels")
	private String levelsJson;
	
	@Column(name="last_updated")
	private Date lastUpdated;
	
	@Transient
    private Levels levels;
	
	@Transient
    private List<Stats> stats;
	
	@Transient
	private String status;
	
    public String getStatus() {
        return status;
    }

    /**
	 * @return the statsJson
	 */
	public String getStatsJson() {
		return statsJson;
	}

	/**
	 * @param statsJson the statsJson to set
	 */
	public void setStatsJson(String statsJson) {
		this.statsJson = statsJson;
	}

	/**
	 * @return the levelsJson
	 */
	public String getLevelsJson() {
		return levelsJson;
	}

	/**
	 * @param levelsJson the levelsJson to set
	 */
	public void setLevelsJson(String levelsJson) {
		this.levelsJson = levelsJson;
	}

	public void setStatus(String status) {
        this.status = status;
    }
	
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long id) {
        this.userId = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public long getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(Integer timePlayed) {
        this.timePlayed = timePlayed;
    }

    public Levels getLevels() {
        return levels;
    }

    public void setLevels(Levels levels) {
        this.levels = levels;
    }
    
    public List<Stats> getStats() {
        return stats;
    }

    public void setStats(List<Stats> stats) {
        this.stats = stats;
    }
    
    public Integer getFellowshipName() {
        return fellowshipName;
    }

    public void setFellowshipName(Integer fellowshipName) {
        this.fellowshipName = fellowshipName;
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
    
    public String toString() {
        return "UserId: " + this.userId + ", Name: " + this.characterName.toString() + 
        		", timePlayed: " + this.timePlayed + ", Levels: " + 
        		this.levels.toString() + ", Stats: " + this.stats + ", fellowshipId: "+ 
        		this.getFellowshipName();
    }
}
