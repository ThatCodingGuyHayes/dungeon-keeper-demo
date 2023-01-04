package youtube.thatcodingguy.dungeonkeeper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import youtube.thatcodingguy.dungeonkeeper.domains.rooms.Room;
import youtube.thatcodingguy.dungeonkeeper.domains.rooms.RoomRepository;

@SpringBootApplication
public class DungeonKeeperApplication {

    public static void main(String[] args) {
        SpringApplication.run(DungeonKeeperApplication.class, args);
    }

    @Autowired
    RoomRepository roomRepository;

    @Bean
    public CommandLineRunner demo(RoomRepository roomRepository) {
        return (args) -> {
            roomRepository.save(new Room("Abandoned Barracks"));
            roomRepository.save(new Room("Throne Room"));
        };
    }
}
