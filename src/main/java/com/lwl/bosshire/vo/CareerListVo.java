package com.lwl.bosshire.vo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Tolerate;

import java.util.List;

@Data
@Builder
public class CareerListVo {

    private List<CareerVo> careers;

    @Tolerate
    public CareerListVo() { }
}
