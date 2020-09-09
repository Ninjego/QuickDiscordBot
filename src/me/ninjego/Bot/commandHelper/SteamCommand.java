package me.ninjego.Bot.commandHelper;

import me.ninjego.Bot.Main;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class SteamCommand extends ListenerAdapter {

	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
		String[] args = e.getMessage().getContentRaw().split(" ");
		
		if(args[0].equalsIgnoreCase(Main.prefix + "steam")) {

			e.getAuthor().openPrivateChannel().queue((channel) -> {
				channel.sendMessage(">>> " + getAlphaNumericString(4).toUpperCase() + "-" + getAlphaNumericString(4).toUpperCase() + "-" + getAlphaNumericString(4).toUpperCase() + "-" + getAlphaNumericString(4).toUpperCase()).queue();
			});

			EmbedBuilder embed = new EmbedBuilder();
			
			embed.setTitle("Succefully sent steam code");
			embed.setColor(0x0388fc);
			
			e.getChannel().sendMessage(embed.build()).queue();
			
			embed.clear();
		}
	}
	
	public  static String getAlphaNumericString(int n) 
    { 
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 

        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 

            int index 
                = (int)(AlphaNumericString.length() 
                        * Math.random()); 

            sb.append(AlphaNumericString 
                          .charAt(index)); 
        } 
  
        return sb.toString(); 
    } 
  
	
}
