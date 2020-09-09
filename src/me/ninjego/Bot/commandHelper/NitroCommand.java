package me.ninjego.Bot.commandHelper;

import me.ninjego.Bot.Main;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class NitroCommand extends ListenerAdapter {
	
	public void onGuildMessageReceived(GuildMessageReceivedEvent e) {
		String[] args = e.getMessage().getContentRaw().split(" ");
		
		if(args[0].equalsIgnoreCase(Main.prefix + "nitro")) {
			
			e.getAuthor().openPrivateChannel().queue((channel) -> {
				channel.sendMessage("https://discord.gift/" + getAlphaNumericString(16)).queue();
			});
			
			EmbedBuilder embed = new EmbedBuilder();
			
			embed.setTitle("Succefully sent nitro code");
			embed.setColor(0xbd0097);
			
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
