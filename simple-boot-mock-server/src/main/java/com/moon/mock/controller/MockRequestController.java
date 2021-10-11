package com.moon.mock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/requests")
public class MockRequestController {

//    @Autowired
//    private MockRequestService mockRequestService;
//
//    @GetMapping
//    public SimpleResult<List<MockRequest>> search(@ModelAttribute MockRequestQueryVo queryVo) {
//        Page<MockRequest> page = SimpleResultUtils.toPage(queryVo);
//        QueryWrapper<MockRequest> queryWrapper = Wrappers.<MockRequest>query();
//        if (queryVo.getGroupId() != null) {
//            queryWrapper.eq("group_id", queryVo.getGroupId());
//        }
//        String keyword = StringUtils.trimToEmpty(queryVo.getKeyword());
//        if (StringUtils.isNotBlank(keyword)) {
//            queryWrapper.and(wrapper -> wrapper.like("request_name", keyword)
//                    .or().like("request_path", keyword));
//        }
//        queryWrapper.orderByAsc("request_path", "create_date");
//        return SimpleResultUtils.createSimpleResult(mockRequestService.page(page, queryWrapper));
//    }
//
//    @GetMapping("/{id}")
//    public SimpleResult<MockRequest> get(@PathVariable("id") Integer id) {
//        return SimpleResultUtils.createSimpleResult(mockRequestService.getById(id));
//    }
//
//    @GetMapping("/getDefaultData/{requestId}")
//    public SimpleResult<MockData> getDefaultData(@PathVariable("requestId") Integer requestId) {
//        return SimpleResultUtils.createSimpleResult(mockRequestService.findMockData(requestId, null));
//    }
//
//    @PostMapping("/saveMockParams")
//    public SimpleResult saveMockParams(@RequestBody MockData data) {
//        return SimpleResultUtils.createSimpleResult(mockRequestService.saveMockParams(data));
//    }
//
//    @DeleteMapping("/{id}")
//    public SimpleResult remove(@PathVariable("id") Integer id) {
//        return SimpleResultUtils.createSimpleResult(mockRequestService.deleteMockRequest(id));
//    }
//
//    @PostMapping
//    public SimpleResult save(@RequestBody MockRequest request) {
//        if (mockRequestService.existsMockRequest(request)) {
//            return SimpleResultUtils.createSimpleResult(MockErrorConstants.CODE_1001);
//        }
//        return SimpleResultUtils.createSimpleResult(mockRequestService.saveOrUpdate(SimpleMockUtils.addAuditInfo(request)));
//    }
}
