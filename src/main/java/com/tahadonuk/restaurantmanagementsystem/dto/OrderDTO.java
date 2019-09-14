package com.tahadonuk.restaurantmanagementsystem.dto;

import com.tahadonuk.restaurantmanagementsystem.data.entity.RestaurantTable;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {
    private List<OrderItemDTO> items;
    private double totalPrice;
    private RestaurantTable table;
    private Date orderDate;
}

// [ai:2026-07-24] // TODO: add validation for orderItem quantities
