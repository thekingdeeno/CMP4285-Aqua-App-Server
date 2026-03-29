package com.example.aqua.modules.hardware;

import org.springframework.stereotype.Service;
import com.example.aqua.modules.hardware.dtos.AddHardwareReq;
import java.util.HashMap;
import java.util.Map;

@Service
public class HardwareService {
    
    public HardwareService() {

    }


    public Map<String, Object> addHardware(AddHardwareReq body) {
        System.out.println("Adding hardware: " + body.getHardwareId() + " for user: " + body.getUserId());

        


        Map<String, Object> response = new HashMap<>();
        response.put("status", true);
        response.put("message", "Hardware added successfully");
        response.put("data", null);
        return response;
    }

}