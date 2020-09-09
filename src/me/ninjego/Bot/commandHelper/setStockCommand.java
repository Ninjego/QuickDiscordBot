package me.ninjego.Bot.commandHelper;

import me.ninjego.Bot.Main;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class setStockCommand extends ListenerAdapter {

	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
		String[] args = e.getMessage().getContentRaw().split(" ");

		if (args[0].equalsIgnoreCase(Main.prefix + "setstock")) {
			
			if(!e.getMember().hasPermission(Permission.ADMINISTRATOR)) { e.getChannel().sendMessage(">>> You dont have permissions to execute this command."); return;}
			
			if (args[1].equalsIgnoreCase("nitro")) {
				if (args[2] == null)
					return;

				Main.NitroStock = args[2];

				e.getChannel().sendMessage("Succefully changed stock to **" + args[2] + "**").queue();
			}
			
			if(args[1].equalsIgnoreCase("steam")) {
				if (args[2] == null)
					return;

				Main.SteamStock = args[2];

				e.getChannel().sendMessage("Succefully changed stock to **" + args[2] + "**").queue();
			}

		}
	}

}
