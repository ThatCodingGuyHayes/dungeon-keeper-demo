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
     * @return - a list of all rooms
     */
    @GetMapping
    public Iterable<Room> getRooms() {
        return roomService.getAllRooms();
    }

    /**
     * Defines the post endpoint for Rooms.
     *
     * @param room - room to persist
     * @return - posted room
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Room createRoom(@RequestBody Room room) {
        return roomService.createRoom(room);
    }

    /**
     * Exposes an endpoint for editing a room
     *
     * @param room - information to be updated in the database
     * @param id   - id of the object to updated
     * @return - the updated object
     */
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public Room editRoom(@RequestBody Room room, @PathVariable Long id) {
        return roomService.editRoom(room, id);
    }

    /**
     * Exposes an endpoint for deleting a room
     *
     * @param id - id of the object to be deleted
     * @return - 204 No Content
     */
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteRoom(@PathVariable Long id) {
        roomService.deleteRoom(id);
    }
}
