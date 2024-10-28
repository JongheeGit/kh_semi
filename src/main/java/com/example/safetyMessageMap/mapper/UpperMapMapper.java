package com.example.safetyMessageMap.mapper;

import com.example.safetyMessageMap.vo.UpperMapVO;
import com.example.safetyMessageMap.vo.UpperMapVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UpperMapMapper {


        //@Insert("INSERT INTO SMM.map (region_id, svg_data) VALUES (#{regionId}, #{svgData})") SQL안써서 어노테이션들 주석처리
        //@Options(useGeneratedKeys = true, keyProperty = "id")
        int insertMap(UpperMapVO Map);

        //@Select("SELECT * FROM SMM.map")
        List<UpperMapVO> selectAllMaps();

        //@Select("SELECT * FROM SMM.map WHERE region_id = #{regionId}")
        UpperMapVO selectMapId(String id);

        //@Update("UPDATE SMM.map SET svg_data = #{svgData} WHERE region_id = #{regionId}")
        int updateMap(UpperMapVO Map);

        //@Delete("DELETE FROM SMM.map WHERE id = #{id}")
        int deleteMap(String id);
    }

