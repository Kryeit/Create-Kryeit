package com.kryeit;

import com.kryeit.event.*;
import com.kryeit.listener.test;
import com.simibubi.create.foundation.data.CreateRegistrate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static final String MOD_ID = "kryeit";
    public static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(MOD_ID);

    public static void init() {
        TrainRelocateEvent.EVENT.register(new test());
    }

    public static CreateRegistrate registrate() {
        return REGISTRATE;
    }
}
