package com.guchunhui.service;

import com.guchunhui.model.ShoppingListItem;

import java.util.List;

/**
 * Created by gch on 16-12-10.
 */
public interface ShoppingListItemService {
    List<ShoppingListItem> getItems(long shoppingListId);
    boolean insertItem(ShoppingListItem shoppingListItem);
    boolean deleteItems(long shoppingListId);

}
