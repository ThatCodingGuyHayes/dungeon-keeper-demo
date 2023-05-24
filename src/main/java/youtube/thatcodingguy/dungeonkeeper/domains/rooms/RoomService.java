package youtube.thatcodingguy.dungeonkeeper.domains.rooms;

public interface RoomService {

    Iterable<Room> getAllRooms();

    Room createRoom(Room room);

    Room editRoom(Room room, Long id);

    boolean deleteRoom(Long id);
}
