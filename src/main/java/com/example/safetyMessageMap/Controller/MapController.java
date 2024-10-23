package com.example.safetyMessageMap.Controller;

import com.example.safetyMessageMap.Service.MapService;
import com.example.safetyMessageMap.vo.MapVO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/map")
public class MapController {
    private final MapService mapService;

    @GetMapping
    public List<MapVO> getAllMaps() {
        return mapService.getAllMaps();
    }

    @GetMapping("/{regionId}")
    public MapVO getMapById(@PathVariable String Id) {
        return mapService.getMapById(Id);
    }

    @PostMapping
    public int insertMap(@RequestBody MapVO map) {
        return mapService.insertMap(map);
    }

    @PutMapping("/{regionId}")
    public int updateMap(@PathVariable String Id, @RequestBody MapVO map) {
        map.setId(Id);
        return mapService.updateMap(map);
    }

    @DeleteMapping("/{regionId}")
    public int deleteMap(@PathVariable String Id) {
        return mapService.deleteMap(Id);
    }
}
