package com.lwl.bosshire.vo;

import com.lwl.bosshire.pojo.Career;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class CareerListVo {

    private List<Career> careers;

}
