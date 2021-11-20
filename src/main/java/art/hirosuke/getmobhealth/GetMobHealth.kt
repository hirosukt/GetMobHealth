package art.hirosuke.getmobhealth;

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityInteractEvent
import org.bukkit.event.player.PlayerInteractAtEntityEvent
import org.bukkit.plugin.java.JavaPlugin

class GetMobHealth : JavaPlugin(), Listener {
   
   override fun onEnable() {
      this.server.pluginManager.registerEvents(this, this)
   }
   
   @EventHandler
   fun onEntityInteract(e: PlayerInteractAtEntityEvent) {
      val interacter = e.player
      val entity = e.rightClicked
      interacter
   }
}
