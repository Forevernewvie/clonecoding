package com.jaebin.homework.data

data class Title<T>(
    val title:String,
    val icon:Int,
    val sumItemList:List<T>,
)
