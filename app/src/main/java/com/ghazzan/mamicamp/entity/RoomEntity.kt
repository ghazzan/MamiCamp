package com.ghazzan.mamicamp.entity

data class RoomEntity(val id: Int = 0,
                      val name: String = "",
                      val description: String = "",
                      val type: String = "",
                      val category: String = "",
                      val price: Int = 0,
                      val createdAt: String,
                      val updatedAt: String)