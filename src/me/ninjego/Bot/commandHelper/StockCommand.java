package me.ninjego.Bot.commandHelper;

import me.ninjego.Bot.Main;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class StockCommand extends ListenerAdapter {

	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
		String[] args = e.getMessage().getContentRaw().split(" ");
		
		if(args[0].equalsIgnoreCase(Main.prefix + "stock")) {
			System.out.println("Stock command executed");
			EmbedBuilder stock = new EmbedBuilder();
			stock.setTitle("Bot Stock");
			stock.setDescription("All of these codes are unchecked");
			stock.addField("Unchecked","Nitro stock: **" + Main.NitroStock + "**",false);
			stock.addField("Unchecked","Steam code: **" + Main.SteamStock + "**",false);
			stock.setColor(0x852c9c);
			
			e.getChannel().sendTyping();
			e.getChannel().sendMessage(stock.build()).queue();
			stock.clear();
		}
	}
}
