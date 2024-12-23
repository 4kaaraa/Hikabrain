package fr.kara.heria.hikabrain.config;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public enum SpawnLocation {
    SPAWN(new Location(Bukkit.getWorld("world"), -358.5, 68, 395.5, 0, 0)),
    SPEC(new Location(Bukkit.getWorld("world"), -480.5, 75, 399.5, -1, 89)),

    //Bleu
    BLEU(new Location(Bukkit.getWorld("world"), -480.5, 72, 384.5, 0, 12)),
    BEDBLEUH(new Location(Bukkit.getWorld("world"), -481, 67, 384)),
    BEDBLEUF(new Location(Bukkit.getWorld("world"), -481, 67, 385)),

    //Rouge
    RED(new Location(Bukkit.getWorld("world"), -480.5, 72, 414.5, -180, 7)),
    BEDREDH(new Location(Bukkit.getWorld("world"), -481, 67, 412)),
    BEDREDF(new Location(Bukkit.getWorld("world"), -481, 67, 413)),
    ;


    private final Location location;

    SpawnLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }
}
