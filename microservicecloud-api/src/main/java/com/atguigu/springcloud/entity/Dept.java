package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author Draghu
 * @date 2018/11/6 16:38
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Dept {

    private Long deptno;
    private String dname;
    private String db_source;
}
