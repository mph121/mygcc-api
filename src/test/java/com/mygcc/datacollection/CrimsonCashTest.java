package com.mygcc.datacollection;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Assume;
import org.junit.Test;

import javax.ws.rs.core.Application;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CrimsonCashTest extends JerseyTest {
    @Override
    protected Application configure() {
        enable(TestProperties.LOG_TRAFFIC);
        enable(TestProperties.DUMP_ENTITY);
        return new ResourceConfig(Authorization.class);
    }

    /**
     * Test chapel data length.
     * @throws Exception any of numerous Exceptions
     */
    @Test
    public void testGetCrimsonCashDataLength() throws Exception {
        Assume.assumeTrue(System.getenv("myGCC-username") != null
                && System.getenv("myGCC-password") != null);

        CrimsonCash cc = new CrimsonCash(new Authorization(
                System.getenv("myGCC-username"),
                System.getenv("myGCC-password")));
        Map<String, Object> ccdata = cc.getCrimsonCashData();
        assertEquals(ccdata.size(), 1);
    }
}