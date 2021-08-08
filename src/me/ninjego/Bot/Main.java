package me.ninjego.Bot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.security.auth.login.LoginException;

import me.ninjego.Bot.commandHelper.NitroCommand;
import me.ninjego.Bot.commandHelper.SteamCommand;
import me.ninjego.Bot.commandHelper.StockCommand;
import me.ninjego.Bot.commandHelper.setStockCommand;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class Main {

	public static String prefix = ".";
	
	public static String NitroStock = new Random().nextInt(10 - 1 + 1) + 1 + "k";
	public static String SteamStock = 251 + "";
	
	public static List<String> NordVPNacc = new ArrayList<String>();
	
	public static JDA jda;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws LoginException {
		jda = new JDABuilder(AccountType.BOT).setToken("token").build();
		
		jda.getPresence().setStatus(OnlineStatus.DO_NOT_DISTURB);
		jda.getPresence().setActivity(Activity.watching("Discord Nitro"));
		
		jda.addEventListener(new NitroCommand());
		jda.addEventListener(new StockCommand());
		jda.addEventListener(new setStockCommand());
		jda.addEventListener(new SteamCommand());
	}
	
}
