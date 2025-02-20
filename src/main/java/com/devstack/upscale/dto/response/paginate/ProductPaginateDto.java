package com.devstack.upscale.dto.response.paginate;

import com.devstack.upscale.dto.response.ResponseCustomerDto;
import com.devstack.upscale.dto.response.ResponseProductDto;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductPaginateDto {
    private long count;
    private List<ResponseProductDto> dataList;
}
