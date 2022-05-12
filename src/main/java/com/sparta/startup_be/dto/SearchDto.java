package com.sparta.startup_be.dto;

import com.sparta.startup_be.model.Estate;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchDto {

    private List<EstateResponseDto> estateResponseDtoList;
    private int totalpage;
    private int presentpage;


    public SearchDto (List<EstateResponseDto> estateResponseDtoList , int totalpage,int presentpage) {
        this.estateResponseDtoList = estateResponseDtoList;
        this.totalpage = totalpage;
        this.presentpage = presentpage;
    }

}
