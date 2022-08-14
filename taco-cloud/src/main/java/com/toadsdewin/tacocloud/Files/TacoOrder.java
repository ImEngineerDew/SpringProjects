package com.toadsdewin.tacocloud.Files;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;

@Data
public class TacoOrder
{
    @NotBlank(message="El nombre del domiciliario es requerido")
    private String deliveryName;

    @NotBlank(message="La calle no debe quedar en blanco")
    private String deliveryStreet;

    @NotBlank(message="La ciudad no debe quedar en blanco")
    private String deliveryCity;

    @NotBlank(message = "La provincia no debe quedar en blanco")
    private String deliveryState;

    @NotBlank(message = "El código zip no debe quedar en blanco")
    private String deliveryZip;

    @CreditCardNumber(message = "Su número de tarjeta es inválido")
    private String ccNumber;

    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",message="Debe tener formato MM/YY")
    private String ccExpiration;

    @Digits(integer=3, fraction=0, message="Invalid CVV")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>(); /*Using the Taco.java to insert your taco order*/
    public void addTaco(Taco taco)
    {
        this.tacos.add(taco);
    }
}
