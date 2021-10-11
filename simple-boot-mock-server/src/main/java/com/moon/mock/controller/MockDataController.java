package com.moon.mock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/data")
public class MockDataController {

//    @Autowired
//    private MockDataService mockDataService;
//
//    @GetMapping
//    public SimpleResult<List<MockData>> search(@ModelAttribute MockDataQueryVo queryVo) {
//        Page<MockData> page = SimpleResultUtils.toPage(queryVo);
//        QueryWrapper<MockData> queryWrapper = Wrappers.<MockData>query();
//        if (queryVo.getRequestId() != null) {
//            queryWrapper.eq("request_id", queryVo.getRequestId());
//        }
//        return SimpleResultUtils.createSimpleResult(mockDataService.page(page, queryWrapper));
//    }
//
//    @GetMapping("/{id}")
//    public SimpleResult<MockData> get(@PathVariable("id") Integer id) {
//        return SimpleResultUtils.createSimpleResult(mockDataService.getById(id));
//    }
//
//    @DeleteMapping("/{id}")
//    public SimpleResult remove(@PathVariable("id") Integer id) {
//        return SimpleResultUtils.createSimpleResult(mockDataService.removeById(id));
//    }
//
//    @PostMapping
//    public SimpleResult save(@RequestBody MockData data) {
//        return SimpleResultUtils.createSimpleResult(mockDataService.saveOrUpdate(SimpleMockUtils.addAuditInfo(data)));
//    }
//
//    @PostMapping("/preview")
//    public String previewResponse(@RequestBody String data) {
//        return MockJsUtils.mock(data);
//    }
//
//    @PostMapping("/markDefault")
//    public SimpleResult markDefault(@RequestBody MockData data) {
//        return SimpleResultUtils.createSimpleResult(mockDataService.markMockDataDefault(data));
//    }
}
