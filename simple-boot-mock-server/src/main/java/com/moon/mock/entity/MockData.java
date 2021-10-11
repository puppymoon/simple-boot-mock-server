package com.moon.mock.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class MockData {

	@ManyToOne
	private MockGroup mockGroup;

	@ManyToOne
	private MockRequest mockRequest;

	@Id
	private Long id;
	private String creator;
	private Date createDate;
	private String modifier;
	private Date modifyDate;
	private Integer status;
//	private Integer groupId;
//	private Integer requestId;
	private Integer statusCode;
	private Integer defaultFlag;
	private String contentType;
	private String responseBody;
	private String description;
	private String headers;
	private String mockParams;
	private String title;
	private String content;

}