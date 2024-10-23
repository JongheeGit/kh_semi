package com.emerMsg.demo.controller;

import com.emerMsg.demo.subMap.Seoul;
import com.emerMsg.demo.subMap.Busan;
import com.emerMsg.demo.subMap.Daegu;
import com.emerMsg.demo.subMap.Incheon;
import com.emerMsg.demo.subMap.Gwangju;
import com.emerMsg.demo.subMap.Daejeon;
import com.emerMsg.demo.subMap.Ulsan;
import com.emerMsg.demo.subMap.Sejong;
import com.emerMsg.demo.subMap.Gyeonggi;
import com.emerMsg.demo.subMap.Gangwon;
import com.emerMsg.demo.subMap.Chungbuk;
import com.emerMsg.demo.subMap.Chungnam;
import com.emerMsg.demo.subMap.Jeonbuk;
import com.emerMsg.demo.subMap.Jeonnam;
import com.emerMsg.demo.subMap.Gyeongbuk;
import com.emerMsg.demo.subMap.Gyeongnam;
import com.emerMsg.demo.subMap.Jeju;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MapController {

    @GetMapping("/map")
    @ResponseBody
    public String getMap(@RequestParam("region") String region) {
        System.out.println("Requested region: " + region);
        // 지역에 따라 다른 중분류 SVG 데이터를 반환
        switch (region) {
            case "seoul":
                return Seoul.getSeoulSvg();
            case "busan":
                return Busan.getBusanSvg(); 
            case "daegu":
                return Daegu.getDaeguSvg();
            case "incheon":
                return Incheon.getIncheonSvg();
            case "gwangju":
                return Gwangju.getGwangjuSvg();
            case "daejeon":
                return Daejeon.getDaejeonSvg();
            case "ulsan":
                return Ulsan.getUlsanSvg();
            case "sejong":
                return Sejong.getSejongSvg();
            case "gyeonggi":
                return Gyeonggi.getGyeonggiSvg();
            case "gangwon":
                return Gangwon.getGangwonSvg();
            case "chungbuk":
                return Chungbuk.getChungbukSvg();
            case "chungnam":
                return Chungnam.getChungnamSvg();
            case "jeonbuk":
                return Jeonbuk.getJeonbukSvg();
            case "jeonnam":
                return Jeonnam.getJeonnamSvg();
            case "gyeongbuk":
                return Gyeongbuk.getGyeongbukSvg();
            case "gyeongnam":
                return Gyeongnam.getGyeongnamSvg();
            case "jeju":
                return Jeju.getJejuSvg();
            default:
                return "<p>지역 정보를 찾을 수 없습니다.</p>";
        }
    }
}
