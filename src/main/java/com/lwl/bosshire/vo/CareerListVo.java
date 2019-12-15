package com.lwl.bosshire.vo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CareerListVo {

    private List<CareerVo> careers;

    public CareerListVo() { }

}
