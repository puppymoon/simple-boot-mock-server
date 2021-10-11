package com.moon.mock.service;

import com.moon.mock.entity.MockData;
import com.moon.mock.entity.MockRequest;

public interface MockRequestService {
	/**
	 * 删除配置的请求
	 *
	 * @param requestId
	 * @return
	 */
	boolean deleteMockRequest(Integer requestId);

	/**
	 * 判断是否已经存在改Request
	 *
	 * @param request
	 * @return
	 */
	boolean existsMockRequest(MockRequest request);

	/**
	 * 根据请求获取对应的响应数据，优先取默认响应或者第一条响应
	 *
	 * @param request
	 * @param defaultId
	 * @return
	 */
	MockData findMockData(MockRequest request, Integer defaultId);

	/**
	 * 根据请求获取对应的响应数据，优先取默认响应或者第一条响应
	 *
	 * @param requestId
	 * @param defaultId
	 * @return
	 */
	MockData findMockData(Integer requestId, Integer defaultId);

	/**
	 * 把请求相关参数保存到数据库
	 *
	 * @param mockData
	 * @return
	 */
	boolean saveMockParams(MockData mockData);
}
