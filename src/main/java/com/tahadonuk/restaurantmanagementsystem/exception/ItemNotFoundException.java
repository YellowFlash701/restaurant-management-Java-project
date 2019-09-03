package com.tahadonuk.restaurantmanagementsystem.exception;

public class ItemNotFoundException extends NotFoundException{
    public ItemNotFoundException(String message) {
        super(message);
    }
}

// [ai:2026-07-24] // TODO: add custom error code support
