package com.moon.mock.service.impl;

import org.springframework.stereotype.Service;

import com.moon.mock.entity.MockData;
import com.moon.mock.entity.MockRequest;
import com.moon.mock.service.MockRequestService;

@Service
public class MockRequestServiceImpl implements MockRequestService {

	@Override
	public boolean deleteMockRequest(Integer requestId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existsMockRequest(MockRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MockData findMockData(MockRequest request, Integer defaultId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MockData findMockData(Integer requestId, Integer defaultId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveMockParams(MockData mockData) {
		// TODO Auto-generated method stub
		return false;
	}

//    @Autowired
//    private MockDataService mockDataService;
//
//    @Override
//    public boolean deleteMockRequest(Integer requestId) {
//        mockDataService.remove(Wrappers.<MockData>query().eq("request_id", requestId));
//        return removeById(requestId);
//    }
//
//    @Override
//    public boolean existsMockRequest(MockRequest request) {
//        List<MockRequest> existRequests = list(Wrappers.<MockRequest>query()
//                .eq("group_id", request.getGroupId())
//                .eq("request_path", request.getRequestPath()));
//        return existRequests.stream()
//                .anyMatch(existRequest -> !existRequest.getId().equals(request.getId())
//                        && existRequest.getMethod().equalsIgnoreCase(request.getMethod()));
//    }
//
//    @Override
//    public MockData findMockData(MockRequest request, Integer defaultId) {
//        return findMockData(request.getId(), defaultId);
//    }
//
//    @Override
//    public MockData findMockData(Integer requestId, Integer defaultId) {
//        List<MockData> mockDataList = mockDataService.list(Wrappers.<MockData>query()
//                .eq("request_id", requestId)
//                .eq("status", 1));
//        return findMockData(mockDataList, defaultId);
//    }
//
//    /**
//     * 查询MockData
//     *
//     * @param mockDataList
//     * @param defaultId
//     * @return
//     */
//    private MockData findMockData(List<MockData> mockDataList, Integer defaultId) {
//        MockData result = null;
//        for (MockData mockData : mockDataList) {
//            if (defaultId != null && defaultId.equals(mockData.getId())) { // 强制指定
//                return mockData;
//            }
//            if (result == null || (!SimpleMockUtils.isDefault(result) && SimpleMockUtils.isDefault(mockData))) {
//                result = mockData;
//            }
//        }
//        return result;
//    }
//
//    @Override
//    public boolean saveMockParams(MockData mockData) {
//        boolean saveToRequest = mockData.getId() == null; // 没有mockData，保存到request
//        if (mockData.getId() != null) {
//            MockData savedMockData = mockDataService.getById(mockData.getId());
//            if (savedMockData != null) {
//                savedMockData.setMockParams(mockData.getMockParams());
//                SimpleMockUtils.addAuditInfo(savedMockData);
//                mockDataService.updateById(savedMockData);
//                if(SimpleMockUtils.isDefault(savedMockData)){ // 默认数据也保存到request
//                    saveToRequest = true;
//                }
//            }
//        }
//        if (saveToRequest && mockData.getRequestId() != null) {
//            MockRequest savedMockRequest = getById(mockData.getRequestId());
//            if (savedMockRequest != null) {
//                savedMockRequest.setMockParams(mockData.getMockParams());
//                SimpleMockUtils.addAuditInfo(savedMockRequest);
//                updateById(savedMockRequest);
//            }
//        }
//        return true;
//    }
}
