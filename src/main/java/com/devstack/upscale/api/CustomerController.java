package com.devstack.upscale.api;

import com.devstack.upscale.dto.request.RequestCustomerDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @PostMapping
    public String create(@RequestBody RequestCustomerDto dto){
        System.out.println(dto.getName());
        return "create()";
    }
    @PutMapping
    public String update(@RequestBody RequestCustomerDto dto){
        return "update()";
    }
    @GetMapping
    public String getAll(
            @RequestParam String searchText,
            @RequestParam int page,
            @RequestParam int size
    ){
        return "getAll()";
    }
    @GetMapping("/{id}")
    public String getById(@PathVariable String id){
        return "getById()";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id){
        return "delete()";
    }

}
