package com.example.safetyMessageMap.Service;

import com.example.safetyMessageMap.vo.MapVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
@AllArgsConstructor
public class MapService{
    private final MapMapper MapMapper;

    @Autowired
    public MapService(MapMapper MapMapper) {
        this.MapMapper = MapMapper;
    }
}
private MapVO mapDB(Map map) {
    MapVO vo = new MapVO();
    vo.setId(map.getId());
    vo.setSvgData(map.getSvgData());
    return vo;
}
