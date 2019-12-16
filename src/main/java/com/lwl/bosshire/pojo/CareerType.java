package com.lwl.bosshire.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CareerType {

    private Integer typeId;

    private Integer typeLevel;

    private String typeName;

    private Integer typeParentId;

}