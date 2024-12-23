package fr.kara.heria.hikabrain.commands;

import fr.heriamc.api.HeriaAPI;
import fr.heriamc.api.server.HeriaServer;
import fr.heriamc.api.server.HeriaServerType;
import fr.heriamc.api.user.rank.HeriaRank;
import fr.heriamc.bukkit.HeriaBukkit;
import fr.heriamc.bukkit.command.CommandArgs;
import fr.heriamc.bukkit.command.HeriaCommand;
import fr.heriamc.bukkit.instance.menu.InstanceListMenu;
import fr.heriamc.proxy.packet.SendPlayerPacket;
import org.bukkit.entity.Player;

public class hubCommands {

    private final HeriaBukkit bukkit;

    public hubCommands(HeriaBukkit heriaBukkit) {
        this.bukkit = heriaBukkit;
    }

    @HeriaCommand(name = "hub", power = HeriaRank.ADMIN, inGameOnly = true)
    public void onCommand(CommandArgs args) {
        Player player = args.getPlayer();

        HeriaServer heriaServer = HeriaAPI.get().getServerManager().getWithLessPlayers(HeriaServerType.HUB);
        HeriaAPI.get().getMessaging().send(new SendPlayerPacket(player.getUniqueId(), heriaServer.getName()));
    }
}
