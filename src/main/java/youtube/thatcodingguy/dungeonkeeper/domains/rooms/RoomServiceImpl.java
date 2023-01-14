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
}
