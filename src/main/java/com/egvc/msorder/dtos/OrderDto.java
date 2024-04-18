package com.egvc.msorder.dtos;



import java.time.LocalDateTime;

public record OrderDto(
         Integer orderId,
         LocalDateTime orderDate,
         Double orderFee,
         CartDto cartDto
) {
}
