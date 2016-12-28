package com.guchunhui.serviceImp;

import com.guchunhui.dao.ShoppingListItemMapper;
import com.guchunhui.model.ShoppingListItem;
import com.guchunhui.service.ShoppingListItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gch on 16-12-10.
 */
@Service("shoppingListItemService")
public class ShoppingListItemServiceImp implements ShoppingListItemService{

    @Autowired
    private ShoppingListItemMapper shoppingListItemMapper;

    public List<ShoppingListItem> getItems(long shoppingListId) {
        return shoppingListItemMapper.getItems(shoppingListId);
    }

    public boolean insertItem(ShoppingListItem shoppingListItem) {
        return shoppingListItemMapper.insertItem(shoppingListItem);
    }

    public boolean deleteItems(long shoppingListId) {
        return shoppingListItemMapper.deleteItems(shoppingListId);
    }
}
