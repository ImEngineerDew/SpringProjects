package com.cakefactory.Models;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class Item
{
    private String title;
    private BigDecimal price;

    public Item(String title, BigDecimal price)
    {
        this.title = title;
        this.price = price;
    }
}
