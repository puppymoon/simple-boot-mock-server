package com.moon.mock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moon.mock.service.MockGroupService;

@RestController
@RequestMapping
public class MockController {

	@Autowired
	private MockGroupService mockGroupService;

//	@RequestMapping("/**")
//	public ResponseEntity doMock(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		String dataId = request.getHeader(MockConstants.MOCK_DATA_ID_HEADER);
//		MockData data = mockGroupService.matchMockData(request, NumberUtils.toInt(dataId));
//		if (data != null) {
//			HttpHeaders httpHeaders = calcHeaders(data.getHeaders());
//			if (HttpStatus.MOVED_TEMPORARILY.value() == data.getStatusCode()) {
//				if (SimpleMockUtils.isMockPreview(request)) {
//					return ResponseEntity.ok("重定向请设为默认响应后复制URL到浏览器访问");
//				}
//				return ResponseEntity.status(data.getStatusCode()).headers(httpHeaders)
//						.header(HttpHeaders.LOCATION, data.getResponseBody()).body(null);
//			}
//			return ResponseEntity.status(data.getStatusCode()).headers(httpHeaders)
//					.header(HttpHeaders.CONTENT_TYPE, data.getContentType()).body(data.getResponseBody());
//		}
//		return ResponseEntity.notFound().build();
//	}
}
