package com.moon.mock.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import com.moon.mock.entity.MockData;
import com.moon.mock.entity.MockGroup;
import com.moon.mock.service.MockGroupService;

@Service
public class MockGroupServiceImpl implements MockGroupService, InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteMockGroup(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existsMockGroup(MockGroup group) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MockData matchMockData(HttpServletRequest request, Integer defaultId) {
		// TODO Auto-generated method stub
		return null;
	}

//    @Autowired
//    private MockRequestService mockRequestService;
//
//    @Autowired
//    private MockDataService mockDataService;
//
//    @Setter
//    @Getter
//    private String mockPrefix = MockConstants.MOCK_PREFIX;
//
//    @Getter
//    @Setter
//    private PathMatcher pathMatcher = new AntPathMatcher();
//
//    @Getter
//    @Setter
//    private Pattern groupPathPattern = null;
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        groupPathPattern = Pattern.compile(getMockPrefix() + "/(\\w+).*");
//    }
//
//    /**
//     * 正则表达式计算成group_path的值
//     *
//     * @param requestPath
//     * @return
//     */
//    public String calcGroupPath(String requestPath) {
//        Matcher matcher = groupPathPattern.matcher(requestPath);
//        if (matcher.matches()) {
//            return matcher.group(1);
//        }
//        return null;
//    }
//
//    @Override
//    public boolean deleteMockGroup(Integer id) {
//        mockRequestService.remove(Wrappers.<MockRequest>query().eq("group_id", id));
//        mockDataService.remove(Wrappers.<MockData>query().eq("group_id", id));
//        return this.removeById(id);
//    }
//
//    @Override
//    public boolean existsMockGroup(MockGroup group) {
//        List<MockGroup> existGroups = list(Wrappers.<MockGroup>query()
//                .eq("group_path", group.getGroupPath()));
//        return existGroups.stream().anyMatch(existGroup -> !existGroup.getId().equals(group.getId()));
//    }
//
//    @Override
//    public MockData matchMockData(HttpServletRequest request, Integer defaultId) {
//        String requestPath = request.getServletPath();
//        String method = request.getMethod();
//        String requestGroupPath = calcGroupPath(requestPath);
//        if (StringUtils.isNotBlank(requestGroupPath)) {
//            MockGroup mockGroup = getOne(Wrappers.<MockGroup>query()
//                    .eq("group_path", requestGroupPath)
//                    .eq("status", 1));
//            if (mockGroup != null) {
//                // 查询Request
//                List<MockRequest> mockRequests = mockRequestService.list(Wrappers.<MockRequest>query()
//                        .eq("group_id", mockGroup.getId())
//                        .eq("status", 1));
//                String groupPath = getMockPrefix() + StringUtils.prependIfMissing(mockGroup.getGroupPath(), "/");
//                // 请求是否匹配上Request，如果匹配上就查询Data
//                for (MockRequest mockRequest : mockRequests) {
//                    String configRequestPath = StringUtils.prependIfMissing(mockRequest.getRequestPath(), "/");
//                    configRequestPath = configRequestPath.replaceAll(":([\\w-]+)", "{$1}"); // spring 支持的ant path不支持:var格式，只支持{var}格式
//                    String configPath = groupPath + configRequestPath;
//                    if (pathMatcher.match(configPath, requestPath)
//                            && StringUtils.equalsIgnoreCase(method, mockRequest.getMethod())) {
//                        MockData mockData = mockRequestService.findMockData(mockRequest, defaultId);
//                        processMockData(request, mockData, configPath, requestPath);
//                        return mockData;
//                    }
//                }
//            }
//        }
//        return null;
//    }
//
//    /**
//     * 处理MockData数据
//     *
//     * @param request
//     * @param mockData
//     * @param configPath
//     * @param requestPath
//     */
//    protected void processMockData(HttpServletRequest request, MockData mockData, String configPath, String requestPath) {
//        if (mockData != null) {
//            String responseBody = StringUtils.trimToEmpty(mockData.getResponseBody());
//            Map<String, String> variables = pathMatcher.extractUriTemplateVariables(configPath, requestPath);
//            Enumeration<String> parameterNames = request.getParameterNames();
//            while (parameterNames.hasMoreElements()) {
//                String paramName = parameterNames.nextElement();
//                variables.put(paramName, StringUtils.trimToEmpty(request.getParameter(paramName)));
//            }
//            for (Map.Entry<String, String> entry : variables.entrySet()) {
//                responseBody = responseBody
//                        .replace(StringUtils.join("{{", entry.getKey(), "}}"), entry.getValue())
//                        .replace(StringUtils.join("${", entry.getKey(), "}"), entry.getValue());
//            }
//            mockData.setResponseBody(MockJsUtils.mock(responseBody)); // 使用Mockjs来处理响应数据
//        }
//    }

}
