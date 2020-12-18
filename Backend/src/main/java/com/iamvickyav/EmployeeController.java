package com.iamvickyav;

import com.iamvickyav.model.Employee;
import com.iamvickyav.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

@RestController
@CrossOrigin
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmpConfig empConfig;

    @RequestMapping(value = "/api/employees", method = RequestMethod.GET)
    List<Employee> getAllEmployee(){
        return employeeService.findAll();
    }

    @RequestMapping(value = "/api/message", method = RequestMethod.GET)
    Map getInstance() throws UnknownHostException {
        String localHostAdd = InetAddress.getLocalHost().getHostAddress();
        String localHostName = InetAddress.getLocalHost().getHostName();

        // Remote address
        String loopbackAddress = InetAddress.getLoopbackAddress().getHostAddress();
        String loopbackHostName = InetAddress.getLoopbackAddress().getHostName();

        Map<String, String> map = new HashMap<>();
        map.put("message", empConfig.getMessage());
        map.put("localHostAdd", localHostAdd);
        map.put("localHostName", localHostName);
        map.put("loopbackAddress", loopbackAddress);
        map.put("loopbackHostName", loopbackHostName);

        return map;
    }
}
