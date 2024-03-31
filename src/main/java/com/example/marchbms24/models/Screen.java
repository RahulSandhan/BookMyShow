package com.example.marchbms24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "screens")
public class Screen extends BaseModel {
    private String name;
    @OneToMany(mappedBy = "screen")
    private List<Seat> seats;

    @ManyToOne
    private Theatre theatre;
}
