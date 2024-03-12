package com.maidao.edu.news.springbootdemo.common.reposiotry.support;

import com.maidao.edu.news.springbootdemo.common.entity.Constants;
import com.sunnysuperman.commons.util.FormatUtil;

/**
 * 创建人:chenpeng
 * 创建时间:2019-08-05 10:09
 * Version 1.8.0_211
 * 项目名称：news
 * 类名称:DataQueryObjectPage
 * 类描述:TODO
 **/
public class DataQueryObjectPage extends DataQueryObjectSort {

    protected Integer pageNumber = 0;
    protected Integer pageSize = Constants.PAGESIZE_MIN;

    public Integer getPageNumber() {
        int asInt = FormatUtil.parseIntValue(pageNumber, 0);
        return asInt <= 0 ? 0 : asInt - 1;
    }

    public void setPageNumber(Integer page) {
        this.pageNumber = page;
    }

    public Integer getPageSize() {
        Integer defaultValue = Constants.PAGESIZE_MIN;
        Integer maxValue = Constants.PAGESIZE_MAX;
        if (pageSize == null) {
            return defaultValue;
        }
        if (pageSize <= 0 || pageSize > maxValue) {
            pageSize = (defaultValue > maxValue) ? maxValue : defaultValue;
        }
        return pageSize;
    }

    public void setPageSize(Integer size) {
        this.pageSize = size;
    }

    public Integer getOffSet() {
        return getPageNumber() * getPageSize();
    }
}
