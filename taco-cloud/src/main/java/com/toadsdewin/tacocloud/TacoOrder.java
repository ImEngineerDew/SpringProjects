package com.toadsdewin.tacocloud;
import java.util.List;
import java.util.ArrayList;
import lombok.Data;

@Data
public class TacoOrder
{
    private String clientName;
    private String clientStreet;
    private String clientCity;
    private String clientProvince;
    private String zipCode;
    private String CCNumber;
    private String CCExpires;
    private String ccCVV;
    private List <Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco)
    {
        this.tacos.add(taco);
    }

}
