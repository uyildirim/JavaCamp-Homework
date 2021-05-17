package Entities;

import Entities.Abstracts.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Campaign implements Entity {
    private String campaignName;
    private double campaignRate;
}
