package com.example.interceptor2.months.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Month {

    private int monthNumber;
    private String englishName;
    private String italianName;
    private String germanName;
}
