package com.partTi.controller.recruit;


import com.partTi.pojo.recruit.WorkResult;
import com.partTi.service.recruit.WorkResultService;
import com.partTi.utils.ResponseDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(allowCredentials="true",maxAge = 3600)
@RequestMapping("/work")
public class WorkResultController {

    @Autowired
    private WorkResultService workResultService;

    @GetMapping("/getWorks")
    public ResponseDate getWorks(WorkResult workResult, Integer index, Integer pageSize, String sort){
        return  workResultService.getWorkResultByAny(workResult,index,pageSize,sort);
    }

    @GetMapping("/getWork")
    public ResponseDate getWork(Integer id){
        return workResultService.getWorkResultById(id);
    }

    @GetMapping("/countWork")
    public ResponseDate countWork(WorkResult workResult,String sort){
        return workResultService.countWorkResultByAny(workResult,sort);
    }

    @PostMapping("/addWork")
    public ResponseDate addWork(@RequestBody WorkResult workResult){
        return workResultService.insertWorkResult(workResult);
    }

    @PostMapping("/updateWork")
    public ResponseDate updateWork(@RequestBody WorkResult workResult){
        return workResultService.updateWorkResult(workResult);
    }

    @PostMapping("/deleteWork")
    public ResponseDate deleteWork(@RequestBody Integer id){
        return workResultService.deleteWorkResult(id);
    }
}
