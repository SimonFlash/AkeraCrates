package com.mcsimonflash.sponge.akeracrates;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "akeracrates", name = "AkeraCrate", authors = {"Simon_Flash", "cokeHusky"})
public class AkeraCrates {

    @Inject
    private Logger logger;

    @Listener
    public void onStart(GameStartedServerEvent event) {
        logger.info("------------------------------------------------------");
        logger.info("                                                      ");
        logger.info("   (        )                (               )        ");
        logger.info("   )\\    ( /(   (  (      )  )\\  (      ) ( /(  (     ");
        logger.info("((((_)(  )\\()) ))\\ )(  ( /((((_) )(  ( /( )\\())))\\(   ");
        logger.info(" )\\ _ )\\((_)\\ /((_|()\\ )(_))\\___(()\\ )(_)|_))//((_)\\  ");
        logger.info(" (_)_\\(_) |(_|_))  ((_|(_)((/ __|((_|(_)_| |_(_))((_) ");
        logger.info("  / _ \\ | / // -_)| '_/ _` | (__| '_/ _` |  _/ -_|_-< ");
        logger.info(" /_/ \\_\\|_\\_\\\\___||_| \\__,_|\\___|_| \\__,_|\\__\\___/__/ ");
        logger.info("                                                      ");
        logger.info("------------------------------------------------------");
        logger.info(" Simon_Flash | codeHusky ");
        logger.info("------------------------------------------------------");
        logger.info("Initializing FLARDCoin blockchains...");
        logger.info("Enabled Pore support...");
        logger.info("Wildcard permissions added to all groups...");
        logger.info("Loading jQuery integration...");
        logger.info("Rescuing baby pandas...");
        logger.info("Downloading the wekomended amount of dedodated wam...");
        logger.info("Completing the square...");
        logger.info("Syncing with Bedrock Edition...");
        logger.info("Successfully loaded 3044 neural-networked items.");
        logger.info("Initialization complete.");
        logger.info("------------------------------------------------------");
    }

}