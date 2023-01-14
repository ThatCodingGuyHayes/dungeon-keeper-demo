package youtube.thatcodingguy.dungeonkeeper.domains.rooms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rooms") // localhost:8080/rooms
public class RoomController {

    RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    /**
     * Defines the getAllRooms endpoint.
     *
     * @return
     */
    @GetMapping
    public Iterable<Room> getRooms() {
        return roomService.getAllRooms();
    }

    /**
     * Defines the post endpoint for Rooms.
     *
     * @param room - room to persist
     * @return
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Room createRoom(@RequestBody Room room) {
        return roomService.createRoom(room);
    }
}
