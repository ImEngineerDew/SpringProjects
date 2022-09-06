package com.cakefactory.Services;
import com.cakefactory.Models.Item;
import org.springframework.stereotype.Service;

@Service
public interface CatalogService
{
    public Iterable<Item> getItems();
}
