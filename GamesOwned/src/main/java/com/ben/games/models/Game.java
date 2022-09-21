package com.ben.games.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="games")
public class Game {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @Size(min = 1, max = 200, message="Title must be at least 1 characters.")
	 private String title;
	 
	 @Size(min = 5, max = 200, message="Description must be at least 5 characters.")
	 private String description;
	 
	 @NotNull
	 private String platform;
//	 
//	 @NotNull
//	 private String completed;
//	 
//	 @NotNull
//	 @Size(min=0, max = 100, message = "Rating must be between 0 and 100")
//	 private Integer rating;
//	 
	 @NotNull
	 @Min(value=0, message="cost cannot be blank")
	 private double cost;
//	 
//	 @Size(min = 5, max = 200, message="Description must be at least 5 characters.")
//	 private String review;
	 
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    public Game() {
    }
    
    public Game(String title, String description) {
    	this.title = title;
    	this.description = description;
    }
    public Game(String title, String description, String platform) {
    	this.title = title;
    	this.description = description;
    	this.setPlatform(platform);
    }

    public Game(String title, String description, String platform, double cost) {
    	this.title = title;
    	this.description = description;
    	this.setPlatform(platform);
    	this.cost = cost;
    }
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	public Date getCreatedAt() {
		return this.createdAt  ;
	}
	
	@PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
	
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }   
}