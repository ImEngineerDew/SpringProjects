package com.cakefactory.Models;
import java.math.BigDecimal;
import lombok.Data;
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
    /**
    public String getTitle()
    {
        return title;
    }
    public BigDecimal getPrice()
    {
        return price;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }
     **/
}
