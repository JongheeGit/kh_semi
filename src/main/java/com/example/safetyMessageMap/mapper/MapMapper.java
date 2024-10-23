package com.example.safetyMessageMap.mapper;

import com.example.safetyMessageMap.vo.MapVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MapMapper {


        @Insert("INSERT INTO SMM.map (region_id, svg_data) VALUES (#{regionId}, #{svgData})")
        @Options(useGeneratedKeys = true, keyProperty = "id")
        int insertMap(MapVO Map);

        @Select("SELECT * FROM SMM.map")
        List<MapVO> selectAllMaps();

        @Select("SELECT * FROM SMM.map WHERE region_id = #{regionId}")
        MapVO selectMapId(String id);

        @Update("UPDATE SMM.map SET svg_data = #{svgData} WHERE region_id = #{regionId}")
        int updateMap(MapVO Map);

        @Delete("DELETE FROM SMM.map WHERE id = #{id}")
        int deleteMap(String id);
    }
}
