package com.toadsdewin.tacocloud;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import lombok.Data;

@Data
public class Taco
{
    @NotNull
    @Size(min=5, message = "El nombre debe tener como mínimo 5 caracteres")
    private String name;
    private List<Ingredient> ingredients;
}
