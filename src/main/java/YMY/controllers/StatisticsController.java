package YMY.controllers;

import YMY.dto.StatisticsDto;
import YMY.utils.Check;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("istatistikler")
public class StatisticsController {

    final StatisticsDto statisticsDto;
    public StatisticsController(StatisticsDto statisticsDto) {
        this.statisticsDto = statisticsDto;
    }

    @GetMapping("")
    public String statistics(){
        return "statistics";
    }

    @ResponseBody
    @GetMapping("/infoTopPayingCompany")
    public Map<Check,Object> infoTopPayingCompany(){
        return statisticsDto.infoTopPayingCompany();
    }

}
