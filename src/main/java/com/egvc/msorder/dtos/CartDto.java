package com.egvc.msorder.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Set;

public record CartDto(
         Integer cartId,
         Integer userId,
         @JsonInclude(JsonInclude.Include.NON_NULL)
         Set<OrderDto> orderDtos,
         UserDto user
) {
}
