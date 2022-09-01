package com.cakefactory.Services;
import com.cakefactory.Item;
import org.springframework.stereotype.Service;

@Service
public interface CatalogService
{
    Iterable<Item> getItems();
}
