package com.moon.mock.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class MockRequest {

	@OneToMany(mappedBy = "mockRequest", cascade = { CascadeType.PERSIST, CascadeType.REMOVE }, fetch = FetchType.EAGER)
	private List<MockData> mockData = new ArrayList<>();

	@ManyToOne
	private MockGroup mockGroup;

	@Id
	private Long id;
	private String creator;
	private Date createDate;
	private String modifier;
	private Date modifyDate;
	private Integer status;
//	private Integer groupId;
	private String requestPath;
	private String method;
	private String description;
	private String mockParams;

}
