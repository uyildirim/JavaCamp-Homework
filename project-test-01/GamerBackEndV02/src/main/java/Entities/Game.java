package Entities;

import Entities.Abstracts.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game implements Entity {
    private int id;
    private String gameName;
    private double gamePrice;

}
