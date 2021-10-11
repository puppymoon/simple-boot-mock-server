package com.moon.mock.service.impl;

import org.springframework.stereotype.Service;

import com.moon.mock.entity.MockData;
import com.moon.mock.service.MockDataService;

@Service
public class MockDataServiceImpl  implements MockDataService {

	@Override
	public boolean markMockDataDefault(MockData mockData) {
		// TODO Auto-generated method stub
		return false;
	}

//    @Override
//    public boolean markMockDataDefault(MockData mockData) {
//        MockData existMockData = getById(mockData.getId());
//        boolean result = false;
//        if (existMockData != null && existMockData.getRequestId().equals(mockData.getRequestId())) {
//            result = update(Wrappers.<MockData>update()
//                    .eq("request_id", existMockData.getRequestId())
//                    .set("default_flag", 0));
//            if (SimpleMockUtils.isDefault(mockData)) {
//                result = update(Wrappers.<MockData>update()
//                        .eq("id", existMockData.getId())
//                        .set("default_flag", 1));
//            }
//        }
//        return result;
//    }
//
//    @Override
//    public boolean saveOrUpdate(MockData entity) {
//        boolean result = super.saveOrUpdate(entity);
//        if(result && SimpleMockUtils.isDefault(entity)){
//            this.markMockDataDefault(entity);
//        }
//        return result;
//    }
}
