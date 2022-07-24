package com.toadsdewin.tacocloud;
import org.hibernate.validator.constraints.CreditCardNumber;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;


import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class TacoOrder
{
    @NotBlank(message = "El nombre del despachador es requerido")
    private String deliveryName;
    @NotBlank(message = "Es obligatorio diligenciar la dirección")
    private String deliveryStreet;
    @NotBlank(message = "Es obligatorio diligenciar la ciudad de residencia")
    private String deliveryCity;
    @NotBlank(message = "Es obligatorio diligenciar la provincia o estado")
    private String deliveryState;
    @NotBlank(message = "Es obligatorio su código postal")
    private String deliveryZip;
    @CreditCardNumber(message = "Su número de tarjeta de crédito es inválido")
    private String ccNumber;
    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$", message="Debe tener el formato MM/YY")
    private String ccExpiration;
    @Digits(integer=3, fraction=0, message="CVV Inválido")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
