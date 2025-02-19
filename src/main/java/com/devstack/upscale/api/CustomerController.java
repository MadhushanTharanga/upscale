package com.devstack.upscale.api;

import com.devstack.upscale.dto.request.RequestCustomerDto;
import com.devstack.upscale.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;
    @PostMapping
    public String create(@RequestBody RequestCustomerDto dto){
        System.out.println(dto);
//        customerService.create(dto);
        return "success!";
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
