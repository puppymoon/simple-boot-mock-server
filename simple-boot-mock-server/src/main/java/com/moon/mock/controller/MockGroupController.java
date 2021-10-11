package com.moon.mock.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/groups")
public class MockGroupController {

//    @Autowired
//    private MockGroupService mockGroupService;
//
//    @GetMapping
//    public SimpleResult<List<MockGroup>> search(@ModelAttribute SimpleQueryVo queryVo) {
//        Page<MockGroup> page = SimpleResultUtils.toPage(queryVo);
//        QueryWrapper<MockGroup> queryWrapper = Wrappers.query();
//        String keyword = StringUtils.trimToEmpty(queryVo.getKeyword());
//        if (StringUtils.isNotBlank(keyword)) {
//            queryWrapper.and(wrapper -> wrapper.like("group_name", keyword)
//                    .or().like("group_path", keyword));
//        }
//        return SimpleResultUtils.createSimpleResult(mockGroupService.page(page, queryWrapper));
//    }
//
//    @GetMapping("/{id}")
//    public SimpleResult<MockGroup> get(@PathVariable("id") Integer id) {
//        return SimpleResultUtils.createSimpleResult(mockGroupService.getById(id));
//    }
//
//    @DeleteMapping("/{id}")
//    public SimpleResult remove(@PathVariable("id") Integer id) {
//        return SimpleResultUtils.createSimpleResult(mockGroupService.deleteMockGroup(id));
//    }
//
//    @PostMapping
//    public SimpleResult save(@RequestBody MockGroup group) {
//        if (StringUtils.isBlank(group.getGroupPath())) {
//            group.setGroupPath(SimpleMockUtils.uuid());
//        }
//        if (mockGroupService.existsMockGroup(group)) {
//            return SimpleResultUtils.createSimpleResult(MockErrorConstants.CODE_1001);
//        }
//        return SimpleResultUtils.createSimpleResult(mockGroupService.saveOrUpdate(SimpleMockUtils.addAuditInfo(group)));
//    }
}
