package com.devstack.upscale.service;

import com.devstack.upscale.dto.request.RequestProductDto;
import com.devstack.upscale.dto.response.ResponseProductDto;
import com.devstack.upscale.dto.response.paginate.CustomerPaginateDto;
import com.devstack.upscale.dto.response.paginate.ProductPaginateDto;

public interface ProductService {
    public void create(RequestProductDto dto);
    public ResponseProductDto getById(String id);
    public void update(String id ,RequestProductDto dto);
    public ProductPaginateDto getAll(String searchText, int page, int size);
    public void delete(String id);


}
