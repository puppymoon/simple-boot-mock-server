package com.moon.mock.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class MockGroup {

	@OneToMany(mappedBy = "mockGroup", cascade = { CascadeType.PERSIST, CascadeType.REMOVE }, fetch = FetchType.EAGER)
	private List<MockRequest> mockRequest = new ArrayList<>();

	@OneToMany(mappedBy = "mockGroup", cascade = { CascadeType.PERSIST, CascadeType.REMOVE }, fetch = FetchType.EAGER)
	private List<MockData> mockData = new ArrayList<>();

	@Id
	private Long id;
	private String creator;
	private Date createDate;
	private String modifier;
	private Date modifyDate;
	private Integer status;
	private String groupName;
	private String groupPath;
	private String description;

}
