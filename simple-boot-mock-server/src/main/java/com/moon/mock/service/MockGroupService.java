package com.moon.mock.service;

import javax.servlet.http.HttpServletRequest;

import com.moon.mock.entity.MockData;
import com.moon.mock.entity.MockGroup;

public interface MockGroupService {
	/**
	 * 级联删除请求和数据
	 *
	 * @param id
	 * @return
	 */
	boolean deleteMockGroup(Integer id);

	/**
	 * 检查是否有重复
	 *
	 * @param group
	 * @return
	 */
	boolean existsMockGroup(MockGroup group);

	/**
	 * 匹配路径
	 *
	 * @param request
	 * @param defaultId
	 * @return
	 */
	MockData matchMockData(HttpServletRequest request, Integer defaultId);
}
