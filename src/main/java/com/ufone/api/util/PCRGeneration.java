// Copyright 2019 Shehriyar Qureshi
package com.ufone.api.util;

import java.util.UUID;

/*
 * This class is responsible for generating a unique PCR. It DOES NOT handle pcr
 * and msisdn mapping. It's a utility function which only serves a small
 * purpose. That should be handled by another class.
 *
 * The pcr is in the UUID4 format.
 *
 * @author Shehriyar Qureshi
 */
public class PCRGeneration {
        /*
         * Generate UUID
         *
         * @author Shehriyar Qureshi
         *
         * @return pcr generated pcr to be used to map to a MSISDN.
         */
        public String generatePCR() {
                UUID uuid = UUID.randomUUID();
                String pcr = uuid.toString();
                return pcr;
        }
}
