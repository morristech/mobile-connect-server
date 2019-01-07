// Copyright 2019 Shehriyar Qureshi
package com.ufone.api.util;

import java.util.UUID;

/*
 * This class is responsible for generating a unique PCR.
 * It DOES NOT handle pcr and msisdn mapping. It's a utility function which
 * only serves a small purpose. That should be handled by another class.
 *
 * The pcr is in the UUID4 format.
 */
public class pcrGeneration {

        public String generatePCR() {
                UUID uuid = UUID.randomUUID();
                String pcr = uuid.toString();
                return pcr;
        }
}
