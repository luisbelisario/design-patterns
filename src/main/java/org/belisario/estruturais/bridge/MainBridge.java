package org.belisario.estruturais.bridge;

import org.belisario.estruturais.bridge.platform.FacebookLive;
import org.belisario.estruturais.bridge.platform.Platform;
import org.belisario.estruturais.bridge.platform.TwitchTV;
import org.belisario.estruturais.bridge.platform.Youtube;
import org.belisario.estruturais.bridge.transmission.Live;

public class MainBridge {

    public static void main(String[] args) {

        startTransmission(new Youtube());
        startTransmission(new TwitchTV());
        startTransmission(new FacebookLive());

    }

    private static void startTransmission(Platform platform) {
        Live live = new Live(platform);
        live.broadcast();
        live.result();
    }
}
