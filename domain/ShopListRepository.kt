package com.example.myshop.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun delShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>
}