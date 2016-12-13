package com.guchunhui.mapper;

import com.guchunhui.model.ShoppingCarItems;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by gch on 16-12-13.
 */
public interface ShoppingCarItemsMapper {
    /**
     *
     * @param id
     * @return
     */
    List<ShoppingCarItems> getShoppingCarItemsById(long id);


    int insertCartItem(ShoppingCarItems shoppingCarItems);

    /**
     *
     * @param shoppingCarId
     * @param bookId
     * @return
     */
    ShoppingCarItems getShoppingCarItemsByTwoId(@Param("shoppingCarId") long shoppingCarId,
                                                @Param("bookId") long bookId);
    /**
     * 删除某一个购物车里某类商品
     * @param shoppingCarId
     * @param bookId
     * @return
     */
    int deleteCarItemById(@Param("shoppingCarId") long shoppingCarId,
                          @Param("bookId") long bookId);

    /**
     * 删除某一个购物车里所有的商品,清空购物车
     * @param shoppingCarId
     * @return
     */
    int deleteCarAllItems(@Param("shoppingCarId") long shoppingCarId);

    /**
     * 更新某个购物车的某个商品的数量
     * @param shoppingCarId
     * @param bookId
     * @param quantity
     * @return
     */
    int updateItem(@Param("shoppingCarId") long shoppingCarId,
                   @Param("bookId") long bookId,
                   @Param("quantity") int quantity
    );
}
