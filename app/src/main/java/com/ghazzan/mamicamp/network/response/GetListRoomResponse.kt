package com.ghazzan.mamicamp.network.response

import com.ghazzan.mamicamp.entity.RoomEntity

data class GetListRoomResponse(val data: List<RoomEntity>): StatusResponse()