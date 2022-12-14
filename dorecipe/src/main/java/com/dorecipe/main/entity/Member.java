package com.dorecipe.main.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dorecipe.main.Role;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="member")
public class Member {

	@Id
	@Column(length = 20, nullable = false)
	private String member_id;
	
	@Column(length = 20, nullable = false)
	private String member_pwd;
	
	@Column(length = 20, nullable = false)
	private String member_name;
	
	@Column(length = 40, unique = true, nullable = false)
	private String member_email;
	
	@Column(length = 4, nullable = false)
	private String member_gender;
	
	private LocalDateTime member_birth;
	
	@Column(length = 11, nullable = false)
	private String member_phone;
	
	private String member_imagePath;
	
	private LocalDateTime member_joinDate;
	
	private int member_like;
	
	@Enumerated(EnumType.STRING)
	private Role role;

	@OneToMany(mappedBy = "member_id")
	private List<RecommendRecipe> reco_recipeList;
	
}
