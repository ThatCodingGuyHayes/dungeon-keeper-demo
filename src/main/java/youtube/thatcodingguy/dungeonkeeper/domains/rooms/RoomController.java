package youtube.thatcodingguy.dungeonkeeper.domains.rooms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms") // localhost:8080/rooms
public class RoomController {

    @GetMapping
    public String getRooms(){
        return "rooms";
    }
}
