package com.ghazzan.mamicamp.network.response

import com.ghazzan.mamicamp.entity.RoomEntity

data class GetDetailRoomResponse(val data: RoomEntity): StatusResponse()