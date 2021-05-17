package Entities;

import Entities.Abstracts.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Entity {
    private int id;
    private String firstName;
    private String lastName;
}
