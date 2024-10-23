package com.example.safetyMessageMap.Service;

import com.example.safetyMessageMap.mapper.MapMapper;
import com.example.safetyMessageMap.vo.MapVO;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor

public class MapService {
    private final MapMapper mapMapper;

    public List<MapVO> getAllMaps() {
        return mapMapper.selectAllMaps();
    }

    public MapVO getMapById(String Id) {
        return mapMapper.selectMapId(Id);
    }

    public int insertMap(MapVO map) {
        return mapMapper.insertMap(map);
    }

    public int updateMap(MapVO map) {
        return mapMapper.updateMap(map);
    }

    public int deleteMap(String regionId) {
        return mapMapper.deleteMap(regionId);
    }
}
