package com.huarui.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.huarui.manager.entity.TbItem;
import com.huarui.manager.entity.TbItemExample;
import com.huarui.manager.mapper.TbItemMapper;
import com.huarui.manager.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/11/9.
 */
@Service
public class TbItemServiceImpl implements TbItemService {
    @Autowired
    private TbItemMapper tbItemMapper;
    @Override
    public List<TbItem> testfindall(int page, int size) {
        PageHelper.startPage(page,size);
        TbItemExample example = new TbItemExample();
        List<TbItem> list = tbItemMapper.selectByExample(example);
        return list;
    }
}
