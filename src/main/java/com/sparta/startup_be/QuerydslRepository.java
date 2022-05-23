package com.sparta.startup_be;

import com.sparta.startup_be.estate.dto.EstateResponseDto;
import com.sparta.startup_be.model.Estate;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuerydslRepository {
    int countCityQuery(String city,String monthly,String depositlimt,String feelimit);
    int countGuQuery(String city,String monthly,String depositlimt,String feelimit);
    int countDongQuery(String city,String monthly,String depositlimt,String feelimit);

    int countAllByQuery(@Param("keyword") String city);

    List<String> findDongQuery(double minX,double maxX,double minY,double maxY);
    List<String> findGuQuery(double minX,double maxX,double minY,double maxY);
    List<String> findCityQuery(double minX,double maxX,double minY,double maxY);

    List<Estate> searchAllByCity(@Param("keyword") String city);



}
