package com.lynu.service;

import com.lynu.bean.TableEmployee;
import org.springframework.stereotype.Service;

/**
 * @author 28449
 * @since 2019-01-21 16:38
 */

public interface TableEmployeeServcie {
    /**
     *添加雇员
     * @param employee
     * @return
     */
    public boolean insertEmployee(TableEmployee employee);
}
