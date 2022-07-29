package com.toadsdewin.tacocloud.Files;
import lombok.Data;

import java.util.List;

@Data
public class Taco
{
    private String name;
    private List<Ingredient> ingredients; /*Using the ingredients for create a taco*/
}
