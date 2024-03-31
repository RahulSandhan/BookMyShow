package com.example.marchbms24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity(name = "seats")
public class Seat extends BaseModel{
    private String name;
    private SeatType seatType;

    @ManyToOne
    private Screen screen;
}
