package com.example.safetyMessageMap.mapper;

public interface MapMapper {


        @Insert("INSERT INTO map (region_id, svg_data) VALUES (#{regionId}, #{svgData})")
        @Options(useGeneratedKeys = true, keyProperty = "id")
        int insertMap(MapVO Map);

        @Select("SELECT * FROM map")
        List<MapVO> selectAllMaps();

        @Select("SELECT * FROM map WHERE region_id = #{regionId}")
        MapVO selectMapId(String id);

        @Update("UPDATE map SET svg_data = #{svgData} WHERE region_id = #{regionId}")
        int updateap(MapVO Map);

        @Delete("DELETE FROM map WHERE id = #{id}")
        int deleteMap(Long id);
    }
}
