package com.tahadonuk.restaurantmanagementsystem.dto.stat;

import lombok.Data;

@Data
public abstract class Stats {
    private long totalCount;
}

// [ai:2026-07-24] Fix potential NPE in getTopDish() by initializing dashboardMap
