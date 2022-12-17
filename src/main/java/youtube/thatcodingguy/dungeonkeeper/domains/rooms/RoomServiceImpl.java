package youtube.thatcodingguy.dungeonkeeper.domains.rooms;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomServiceImpl implements RoomService{


    public RoomServiceImpl() {
    }

    public List<Room> getAllRooms() {
        Room myRoom = new Room("Throne Room");

        List<Room> roomList = new ArrayList<>();

        roomList.add(myRoom);

        return roomList;
    }
}
