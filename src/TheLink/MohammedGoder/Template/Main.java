package TheLink.MohammedGoder.Template;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import TheLink.MohammedGoder.BucketAPI.Math.Multiple;

public class Main extends JavaPlugin implements Listener{
	
	int time = 0;
	
	public void getRepeatingTask(int time){
		if(new Multiple().isMultiple(time, 20) == true){
			if(new Multiple().isMultiple(time, 200) == true){
				// 10 Seconds
				
			}

			if(new Multiple().isMultiple(time, 1200) == true){
				// 1 Minute
				
			}
		}
	}
	
	public void onEnable(){
		getServer().getPluginManager().registerEvents(this, this);

		this.saveDefaultConfig();
		
		this.getServer().getScheduler().scheduleAsyncRepeatingTask(this, new Runnable(){

			public void run() {
				time++;

				getRepeatingTask(time);
			}
		}, 0L, 0L);
	}

}
