package com.egvc.msorder.dtos;



public record UserDto(
         Long id,
         String firstName,
         String lastName,
         String email,
         CartDto cartDto
) {
}
