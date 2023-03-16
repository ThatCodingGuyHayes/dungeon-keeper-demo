package youtube.thatcodingguy.dungeonkeeper.domains.rooms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

    RoomRepository roomRepository;

    @Autowired
    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    /**
     * Contacts the database to retrieve all rooms.
     *
     * @return an iterable of rooms
     */
    public Iterable<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    /**
     * Calls the room repostiory to save a new room to the database.
     *
     * @param room - room to persist to the db
     * @return
     */
    @Override
    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    /**
     * Updates a room by id.
     *
     * @param room - new data for the object
     * @param id   - id of the object to be updated
     * @return - the updated object
     */
    @Override
    public Room editRoom(Room room, Long id) {
        room.setId(id);
        return roomRepository.save(room);
    }
}
