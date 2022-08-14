package com.toadsdewin.tacocloud.Files;
import lombok.Data;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
@Data
public class Taco
{
    @NotNull
    @Size(min=5,message="El nombre debe contener al menos 5 caracteres")
    private String name;

    @NotNull
    @Size(min=1,message="Usted debe escoger sólo 1 ingrediente")
    private List<Ingredient> ingredients; /*Using the ingredients for create a taco*/
}
