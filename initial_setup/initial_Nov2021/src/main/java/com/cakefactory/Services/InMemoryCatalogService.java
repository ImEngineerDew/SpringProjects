package com.cakefactory.Services;
import com.cakefactory.Models.Item;
import java.math.BigDecimal;
import java.util.Arrays;

public class InMemoryCatalogService implements CatalogService{
    @Override
    public Iterable<Item> getItems() {
        return Arrays.asList(
                new Item("Test item 1", BigDecimal.valueOf(1.95)),
                new Item("Test item 2", BigDecimal.valueOf(4.99)),
                new Item("Test item 3", BigDecimal.valueOf(3.95))
        );
    }
}
